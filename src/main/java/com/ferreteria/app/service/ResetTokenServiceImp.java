package com.ferreteria.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.token.TokenService;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ResetToken;
import com.ferreteria.app.repository.ResetTokenRepository;

@Service
public class ResetTokenServiceImp implements ResetTokenService {

    @Autowired
    private ResetTokenRepository repo;

    @Override
    public ResetToken findByToken(String token) {
        return repo.findByToken(token);
    }

    @Override
    public void guardar(ResetToken token) {
        repo.save(token);

    }

    @Override
    public void eliminar(ResetToken token) {
        repo.delete(token);
    }
}
