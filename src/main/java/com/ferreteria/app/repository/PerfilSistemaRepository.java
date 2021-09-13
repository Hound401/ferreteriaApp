package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.PerfilSistema;

@Repository
public interface PerfilSistemaRepository extends JpaRepository<PerfilSistema, Integer> {

}
