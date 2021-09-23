package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferreteria.app.entity.ResetToken;

public interface ResetTokenRepository extends JpaRepository<ResetToken, Integer> {

    ResetToken findByToken(String token);
}