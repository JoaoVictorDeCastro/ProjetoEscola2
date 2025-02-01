package com.ajudarobotica.escola.model;

import org.mindrot.jbcrypt.BCrypt;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    private String login;
    private String email;
    private String senha;

    Usuario() {
        
    }

    Usuario(String login, String email, String senha) {
        setLogin(login);
        setEmail(email);
        setSenha(senha);
    }

    public void encryptPassword() {
        String hashed = BCrypt.hashpw(this.senha, BCrypt.gensalt());
        this.senha = hashed;
    }

    String getLogin() {
        return this.login;
    }

    String getEmail() {
        return this.email;
    }

    String getSenha() {
        return this.senha;
    }

    void setLogin(String login) {
        this.login = login;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void setSenha(String senha) {
        this.senha = senha;
    }
}