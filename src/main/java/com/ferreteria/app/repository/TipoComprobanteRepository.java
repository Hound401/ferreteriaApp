package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.TipoComprobante;

@Repository
public interface TipoComprobanteRepository extends JpaRepository<TipoComprobante, Integer> {

}
