package br.com.minhasserverlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/login")
public class ServerLetLogin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	PrintWriter out = resp.getWriter();
	
	String usuario = req.getParameter("usuario");
	String senha = req.getParameter("senha");
	
	out.println("<html>");
	out.println("<body>");
	out.println("Usuario " + usuario + " logado com sucesso");
	out.println("</body>");
	out.println("</html>");
		
		
	}
	

}
