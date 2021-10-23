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

@WebServlet("/ExecuteInsertServlet")
public class ExecuteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ExecuteInsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String destinazione = null;

		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");
		String prezzoDaPagina = request.getParameter("prezzoInput");
		String numeroSerialeDaPagina = request.getParameter("numeroSerialeInput");

		if (marcaDaPagina.equals("") || modelloDaPagina.equals("") || prezzoDaPagina.equals("")
				|| numeroSerialeDaPagina.equals("")) {
			String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare tutti i campi.";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			destinazione = "insert.jsp";
		} else {
			try {

				int prezzo = Integer.parseInt(prezzoDaPagina);
				Televisore abitanteDaInserire = new Televisore(marcaDaPagina, modelloDaPagina, numeroSerialeDaPagina,
						prezzo);
				MyServiceFactory.getTelevisoreServiceInstance().inserisci(abitanteDaInserire);
				request.setAttribute("listTelevisoriAttributeName",
						MyServiceFactory.getTelevisoreServiceInstance().stampaTuttaLaLista());
				destinazione = "results.jsp";

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
