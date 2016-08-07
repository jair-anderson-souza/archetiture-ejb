/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.dac.beansimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author des02
 */
public class ConnectionFactory {

    private String url;
    private String usuario;
    private String senha;
    private String driver;

    public ConnectionFactory() {
        this.url = "jdbc:postgresql://localhost:5432/app-pessoa";
        this.usuario = "postgres";
        this.senha = "123456";
        this.driver = "org.postgresql.Driver";
    }

    public Connection getConexao() {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | ClassNotFoundException e) {
            e.getMessage();
            e.printStackTrace();
            throw new RuntimeException("Falha na Conexão");
        }
    }

}
