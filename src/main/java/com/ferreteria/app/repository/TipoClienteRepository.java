package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.TipoCliente;

@Repository
public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {

}
