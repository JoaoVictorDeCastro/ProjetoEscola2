package com.ajudarobotica.escola.ConexaoManual;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ajudarobotica.escola.Aluno;

public class AlunoRepository {
    public List<Aluno> getAll(Connection connection) throws SQLException {
        Statement st = connection.createStatement();
        ResultSet resultSet = st.executeQuery("select * from aluno");
        List<Aluno> resultado = new ArrayList();
        while (resultSet.next()) {
            String nome = resultSet.getString("nome");
            String cpf = resultSet.getString("cpf");
            String telefone = resultSet.getString("telefone");
            String matricula = resultSet.getString("telefone");
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setCpf(cpf);
            aluno.setTelefone(telefone);
            aluno.setMatricula(matricula);
            resultado.add(aluno);
        }
        return resultado;
    }
}
