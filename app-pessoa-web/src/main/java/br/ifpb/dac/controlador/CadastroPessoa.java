/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.dac.controlador;

import br.ifpb.dac.entidades.Pessoa;
import br.ifpb.dac.entidades.bean.PessoaService;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author des02
 */
@WebServlet(urlPatterns = {"/add"})
public class CadastroPessoa extends HttpServlet {

    @EJB
    private PessoaService pessoaService;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        int idade = Integer.parseInt(req.getParameter("idade"));
        Pessoa p = new Pessoa(nome, idade);
        pessoaService.cadastrasPessoa(p);
        resp.sendRedirect("index.jsp");

    }

   

}
