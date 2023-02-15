package com.philippe.denuncia.resources;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.philippe.denuncia.domain.Notificacao;
import com.philippe.denuncia.domain.Denunciante;
import com.philippe.denuncia.domain.Endereco;
import com.philippe.denuncia.domain.Denuncia;

@RestController
@RequestMapping(value="/v1/denuncias")
public class DenunciaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Denuncia> listar() {
		Denunciante denunciante = new Denunciante();
		denunciante.setCpf("1243");
		denunciante.setNome("Teste");
		
		Notificacao notificacao = new Notificacao();
		notificacao.setDescricao("Descrição 1");
		notificacao.setTitulo("Novo Titulo");
		
		Endereco endereco = new Endereco();
		endereco.setCep("1521564");
		endereco.setBairro("Bairro1");
		
		Denuncia denuncia = new Denuncia();
		denuncia.setNotificacao(notificacao);
		denuncia.setDenunciante(denunciante);
		denuncia.setEndereco(endereco);
		denuncia.setLatitude(new BigDecimal("123.1231"));
		denuncia.setLongitude(new BigDecimal("12.12344"));
		
		
		return Arrays.asList(denuncia);
	}
}
