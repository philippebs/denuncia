package com.philippe.denuncia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.philippe.denuncia.domain.Notificacao;

@Repository
public interface NotificacaoRepository extends JpaRepository<Notificacao, Integer> {
	
}
