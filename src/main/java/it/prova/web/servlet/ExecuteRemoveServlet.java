package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.model.Televisore;
import it.prova.service.MyServiceFactory;

@WebServlet("/ExecuteRemoveServlet")
public class ExecuteRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteRemoveServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Long idTelevisore = Long.parseLong(request.getParameter("idDaRimuovere"));

			Televisore televisoreDaRimuovere = MyServiceFactory.getTelevisoreServiceInstance()
					.caricaSingolo(idTelevisore);
			MyServiceFactory.getTelevisoreServiceInstance().rimuovi(televisoreDaRimuovere);

			request.setAttribute("listTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().stampaTuttaLaLista());

			RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
