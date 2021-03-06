package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
public class ResetToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = false)
    private String token;

    @OneToOne(targetEntity = CuentaUsuarios.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "idCuentaUsuario")
    private CuentaUsuarios user;

    @Column(nullable = false)
    private LocalDateTime expiracion;

    @Column(name = "intentos")
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CuentaUsuarios getUser() {
        return user;
    }

    public void setUser(CuentaUsuarios user) {
        this.user = user;
    }

    public LocalDateTime getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(LocalDateTime expiracion) {
        this.expiracion = expiracion;
    }

    public void setExpiracion(int minutos) {
        LocalDateTime hoy = LocalDateTime.now();
        LocalDateTime exp = hoy.plusMinutes(minutos);
        this.expiracion = exp;
    }

    public boolean estaExpirado() {
        return LocalDateTime.now().isAfter(this.expiracion);
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
