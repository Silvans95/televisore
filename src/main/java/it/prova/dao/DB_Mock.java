package it.prova.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.model.Televisore;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "televisore10", "modello10", "TVMOD10", 10));
		LISTA_TELEVISORI.add(new Televisore(2l, "televisore20", "modello20", "TVMOD20", 20));
		LISTA_TELEVISORI.add(new Televisore(3l, "televisore30", "modello30", "TVMOD30", 30));
		LISTA_TELEVISORI.add(new Televisore(4l, "televisore40", "modello40", "TVMOD40", 40));
		LISTA_TELEVISORI.add(new Televisore(5l, "televisore50", "modello50", "TVMOD50", 50));
		LISTA_TELEVISORI.add(new Televisore(6l, "televisore60", "modello60", "TVMOD60", 60));
		LISTA_TELEVISORI.add(new Televisore(7l, "televisore70", "modello70", "TVMOD70", 70));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId = LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getId)).get()
				.getId();
		return ++resultId;
	}

}
