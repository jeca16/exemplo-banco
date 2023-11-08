package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {

    public void consultarFuncionarios () throws SQLException {
        Conexao conexao = new Conexao();
        Connection objConnection = conexao.getConnection();
        Statement statement = objConnection.createStatement();
        String queryConsulta = "select * from funcionarios";
        ResultSet resultSet = statement.executeQuery(queryConsulta);
        while (resultSet.next()){
            int idFuncionario = resultSet.getInt("id_funcionario");
            String nome = resultSet.getString("nome");
            String cargo = resultSet.getString("cargo");
            double salario = resultSet.getDouble("salario");
            String departamento = resultSet.getString("departamento");

            System.out.println(idFuncionario);
            System.out.println(nome);
            System.out.println(cargo);
            System.out.println(salario);
            System.out.println(departamento);
            System.out.println("*************************************");

        }
    }
}
