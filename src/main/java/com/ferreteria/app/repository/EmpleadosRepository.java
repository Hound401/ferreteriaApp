package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.Empleados;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer>{

}
