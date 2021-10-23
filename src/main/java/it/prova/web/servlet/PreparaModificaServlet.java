package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.service.MyServiceFactory;

@WebServlet("/PreparaModificaServlet")
public class PreparaModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
    public PreparaModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String idDaRimandare = request.getParameter("idDaInviareComeParametro");
			Long idModificare = Long.parseLong(idDaRimandare);			
				request.setAttribute("televisoreDaAggiornare", MyServiceFactory.getTelevisoreServiceInstance().caricaSingolo(idModificare));
			RequestDispatcher rd = request.getRequestDispatcher("aggiorna.jsp");
			rd.forward(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



}
