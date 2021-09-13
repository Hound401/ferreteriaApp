package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.DetalleVenta;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {

}
