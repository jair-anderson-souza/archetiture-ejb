/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.dac.entidades.bean;

import br.ifpb.dac.entidades.Pessoa;
import java.util.List;

/**
 *
 * @author Anderson Souza
 */
public interface PessoaService {

    public void cadastrasPessoa(Pessoa pessoa);

    public List<Pessoa> buscaTodos();


}
