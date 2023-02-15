package com.philippe.denuncia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.philippe.denuncia.domain.Denuncia;

@Repository
public interface DenunciaRepository extends JpaRepository<Denuncia, Integer> {
	
}
