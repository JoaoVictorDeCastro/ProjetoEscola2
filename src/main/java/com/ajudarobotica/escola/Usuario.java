package com.ajudarobotica.escola;

import org.mindrot.jbcrypt.BCrypt;

public class Usuario {
    String login;
    String email;
    String senha;

    public void encryptPassword() {
        String hashed = BCrypt.hashpw(this.senha, BCrypt.gensalt());
        this.senha = hashed;
        
    }
}