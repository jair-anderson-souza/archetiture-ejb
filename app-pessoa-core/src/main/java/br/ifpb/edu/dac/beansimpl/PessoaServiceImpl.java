/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.edu.dac.beansimpl;

import br.ifpb.dac.entidades.Pessoa;
import br.ifpb.dac.entidades.PessoaDao;
import br.ifpb.dac.entidades.bean.PessoaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author Anderson Souza
 */
@Stateless
@Remote(PessoaService.class)
public class PessoaServiceImpl implements PessoaService {
    @EJB
    private PessoaDao dao;
    
    @Override
    public void cadastrasPessoa(Pessoa pessoa) {
        dao.save(pessoa);
        System.out.println("Salvar Service");
    }

    @Override
    public List<Pessoa> buscaTodos() {
        return dao.listarPessoas();
//        System.out.println("Listando Service");
//        return null;
    }

    
}
