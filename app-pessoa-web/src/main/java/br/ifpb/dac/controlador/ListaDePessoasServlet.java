/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifpb.dac.controlador;

import br.ifpb.dac.entidades.Pessoa;
import br.ifpb.dac.entidades.bean.PessoaService;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 */
@WebServlet(urlPatterns = {"/lista"})
public class ListaDePessoasServlet extends HttpServlet{
     @EJB
    private PessoaService pessoaService;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Pessoa> lista = pessoaService.buscaTodos();
        req.getSession().setAttribute("pessoas", lista);
        resp.sendRedirect("listar.jsp");
    }

    
}
