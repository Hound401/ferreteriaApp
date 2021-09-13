package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.Recibos;

@Repository
public interface RecibosRepository extends JpaRepository<Recibos, Integer>{

}
