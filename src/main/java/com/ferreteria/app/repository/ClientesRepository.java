package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Integer> {

}
