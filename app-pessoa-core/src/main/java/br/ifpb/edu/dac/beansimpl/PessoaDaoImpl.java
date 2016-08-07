/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.dac.beansimpl;

import br.ifpb.dac.entidades.Pessoa;
import br.ifpb.dac.entidades.PessoaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author des02
 */
@Stateless
@Remote(PessoaDao.class)
public class PessoaDaoImpl implements PessoaDao {

    private ConnectionFactory con;

    public PessoaDaoImpl() {
        con = new ConnectionFactory();
    }

    @Override
    public void save(Pessoa pessoa) {
        try (Connection conexao = con.getConexao()) {
            String sql = "insert into pessoa(nome, idade) values(?, ?);";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, pessoa.getNome());
                preparedStatement.setInt(2, pessoa.getIdade());
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro!!!");
        }

    }

    @Override
    public List<Pessoa> listarPessoas() {
        List<Pessoa> listaDePessoas;
        try (Connection connection = con.getConexao()) {
            String sql = "select * from pessoa;";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                try (ResultSet resulSet = preparedStatement.executeQuery()) {
                    listaDePessoas = new ArrayList<>();
                    Pessoa pessoa;
                    while (resulSet.next()) {
                        String nome = resulSet.getString("nome");
                        int idade = resulSet.getInt("idade");
                        pessoa = new Pessoa(nome, idade);
                        listaDePessoas.add(pessoa);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Não foi possível realizar uma consulta no seu banco de dados.");
        }
        return listaDePessoas;

    }

}
