package com.philippe.denuncia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.philippe.denuncia.domain.Denunciante;

@Repository
public interface DenuncianteRepository extends JpaRepository<Denunciante, Integer> {
	
}
