package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer> {

}
