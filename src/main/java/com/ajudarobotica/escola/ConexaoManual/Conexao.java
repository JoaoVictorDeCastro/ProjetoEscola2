package com.ajudarobotica.escola.ConexaoManual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private String host = "localhost";
    private String password = "1234";
    private String user = "postgres";
    private String port = "5432";
    private String database = "escola";
    private String url = "jdbc:postgresql://" + host + ":" + port + "/postgres";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
