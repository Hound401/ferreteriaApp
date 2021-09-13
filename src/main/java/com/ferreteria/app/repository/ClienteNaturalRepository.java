package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.ClienteNatural;

@Repository
public interface ClienteNaturalRepository extends JpaRepository<ClienteNatural, Integer>{

}
