package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.ClienteJuridico;

@Repository
public interface ClienteJuridicoRepository extends JpaRepository<ClienteJuridico, Integer> {

}
