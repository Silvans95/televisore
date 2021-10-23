package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.service.MyServiceFactory;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");

		if (marcaDaPagina.equals("") && modelloDaPagina.equals("")) {
			try {
				request.setAttribute("listTelevisoriAttributeName",
						MyServiceFactory.getTelevisoreServiceInstance().stampaTuttaLaLista());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			request.setAttribute("listTelevisoriAttributeName", MyServiceFactory.getTelevisoreServiceInstance()
					.cercaPerMarcaEModello(marcaDaPagina, modelloDaPagina));
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
