package com.ferreteria.app.service;

import com.ferreteria.app.entity.ResetToken;

public interface ResetTokenService {

    ResetToken findByToken(String token);

    void guardar(ResetToken token);

    void eliminar(ResetToken token);
}