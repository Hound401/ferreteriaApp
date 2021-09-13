package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.TipoProducto;

@Repository
public interface TipoProductoRepository extends JpaRepository<TipoProducto, Integer> {

}
