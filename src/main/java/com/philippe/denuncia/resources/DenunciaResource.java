package com.philippe.denuncia.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.philippe.denuncia.domain.Denuncia;
import com.philippe.denuncia.dto.EnderecoGeolocationDTO;
import com.philippe.denuncia.services.DenunciaService;

@RestController
@RequestMapping(value="/v1/denuncias")
public class DenunciaResource {
	
	@Value("${geolocation.api}")
	private String geolocationApi;
	
	@Value("${geolocation.key}")
	private String geolocationKey;
	
	
	@Autowired
	private DenunciaService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findOne(@PathVariable Integer id) {
		Denuncia denuncia = this.service.buscar(id);
		return ResponseEntity.ok().body(denuncia);
	}
	
	private EnderecoGeolocationDTO getEndreco(Denuncia denuncia) {
		String location = "";
		String type = "address";
		if (denuncia.getEndereco() != null) {
			location = String.format("%s+%s+%s+%s+%s", denuncia.getEndereco().getCep(), denuncia.getEndereco().getLogradouro(), 
					denuncia.getEndereco().getBairro(), denuncia.getEndereco().getCidade(), 
					denuncia.getEndereco().getEstado());
		} else {
			location = String.format("%s,%s&includeRoadMetadata=true&includeNearestIntersection=true", denuncia.getLatitude().toString(), denuncia.getLongitude().toString());
			type = "reverse";
		}
		
		String site = String.format(this.geolocationApi, type, this.geolocationKey, location);
		
		RestTemplate restTemplate = new RestTemplate();
		String json = restTemplate.getForObject(site, String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		EnderecoGeolocationDTO enderecoDTO = null;
		try {
			enderecoDTO = objectMapper.readValue(json, EnderecoGeolocationDTO.class);

		} catch (Exception e) {
			System.out.println(e);
		}

		return enderecoDTO;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Denuncia denuncia) {
		
		EnderecoGeolocationDTO enderecoDTO = this.getEndreco(denuncia);
		
		denuncia = service.insert(denuncia, enderecoDTO);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(denuncia.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}
