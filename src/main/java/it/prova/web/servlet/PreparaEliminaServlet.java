package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.service.MyServiceFactory;

/**
 * Servlet implementation class PreparaEliminaServlet
 */
@WebServlet("/PreparaEliminaServlet")
public class PreparaEliminaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public PreparaEliminaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
		String idDaRimandare = request.getParameter("idDaInviareComeParametro");
		Long idEliminare = Long.parseLong(idDaRimandare);
		
			request.setAttribute("televisoreDaRimuovere", MyServiceFactory.getTelevisoreServiceInstance().caricaSingolo(idEliminare));
		
		RequestDispatcher rd = request.getRequestDispatcher("rimuovi.jsp");
		rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
