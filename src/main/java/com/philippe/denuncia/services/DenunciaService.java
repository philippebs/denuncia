package com.philippe.denuncia.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philippe.denuncia.domain.Denuncia;
import com.philippe.denuncia.domain.Denunciante;
import com.philippe.denuncia.domain.Endereco;
import com.philippe.denuncia.domain.Notificacao;
import com.philippe.denuncia.dto.EnderecoGeolocationDTO;
import com.philippe.denuncia.dto.LocationGeolocationDTO;
import com.philippe.denuncia.repositories.DenunciaRepository;
import com.philippe.denuncia.repositories.DenuncianteRepository;
import com.philippe.denuncia.repositories.EnderecoRepository;
import com.philippe.denuncia.repositories.NotificacaoRepository;
import com.philippe.denuncia.services.exceptions.ObjectNotFoundException;

@Service
public class DenunciaService {
	
	@Autowired
	private DenunciaRepository repo;
	
	@Autowired
	private DenuncianteRepository denuncianteRepository;
	
	@Autowired
	private NotificacaoRepository notificacaoRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Denuncia buscar(Integer id) {
		Optional<Denuncia> denuncia = repo.findById(id);
		return denuncia.orElseThrow(() -> new ObjectNotFoundException("Endereço não encontrado para essa localidade."));
	}
	
	private Endereco getEndereco(EnderecoGeolocationDTO enderecoDTO) {
		if (enderecoDTO == null) {
			throw new ObjectNotFoundException("Endereço não encontrado para essa localidade.");
		}
		
		LocationGeolocationDTO locationDTO = enderecoDTO.getResults().get(0).getLocations().get(0);
		
		Endereco endereco = new Endereco();
		endereco.setPais(locationDTO.getAdminArea1());
		endereco.setCep(locationDTO.getPostalCode());
		endereco.setBairro(locationDTO.getAdminArea6());
		endereco.setCidade(locationDTO.getAdminArea5());
		endereco.setEstado(locationDTO.getAdminArea3());
		endereco.setLogradouro(locationDTO.getStreet());
		
		return endereco;
	}
	
	private void validarEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new ObjectNotFoundException("Endereço não encontrado para essa localidade.");
		}
		
		if (endereco.getEstado() == null) {
			throw new ObjectNotFoundException("O estado para este endereço não foi encontrado para essa localidade.");
		}
		
		if (endereco.getCidade() == null) {
			throw new ObjectNotFoundException("A cidade para este endereço não foi encontrado para essa localidade.");
		}
		
		if (endereco.getPais() == null) {
			throw new ObjectNotFoundException("O país para este endereço não foi encontrado para essa localidade.");
		}
		
	}
	
	public Denuncia insert(Denuncia denuncia, EnderecoGeolocationDTO enderecoDTO) {
		
		Endereco endereco = this.getEndereco(enderecoDTO);
		this.validarEndereco(endereco);
		
		Denunciante denunciante = denuncia.getDenunciante();
		denunciante.setId(null);
		denunciante = denuncianteRepository.save(denunciante);
		
		endereco = enderecoRepository.save(endereco);
		denuncia.setEndereco(endereco);
		
		Notificacao notificacao = denuncia.getNotificacao();
		notificacao.setId(null);
		notificacao = notificacaoRepository.save(notificacao);
		
		denuncia.setId(null);
		denuncia.setDenunciante(denunciante);
		denuncia.setNotificacao(notificacao);
		
		return repo.save(denuncia);
	}
	
}
