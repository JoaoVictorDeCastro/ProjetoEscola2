package com.ajudarobotica.escola.conexaomanual;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Conexao conexao = new Conexao();
        Connection connection = conexao.getConnection();


        AlunoRepository alunoRepository = new AlunoRepository();
        alunoRepository.getAll(connection);
    }
}
