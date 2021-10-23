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

@WebServlet("/ExecuteUpdateServlet")
public class ExecuteUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteUpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		String idDaPagina = request.getParameter("idInput");
		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");
		String prezzoDaPagina = request.getParameter("prezzoInput");
		String numeroSerialeDaPagina = request.getParameter("numeroSerialeInput");

		try {

			int prezzo = Integer.parseInt(prezzoDaPagina);
			Long id = Long.parseLong(idDaPagina);
			Televisore televisoreDaInserire = new Televisore(id, marcaDaPagina, modelloDaPagina, numeroSerialeDaPagina,
					prezzo);
			MyServiceFactory.getTelevisoreServiceInstance().aggiorna(televisoreDaInserire);

			request.setAttribute("listTelevisoriAttributeName",
					MyServiceFactory.getTelevisoreServiceInstance().stampaTuttaLaLista());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
		rd.forward(request, response);
	}

}
