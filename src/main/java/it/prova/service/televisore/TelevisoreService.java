package it.prova.service.televisore;

import java.util.List;

import it.prova.dao.televisore.TelevisoreDAO;
import it.prova.model.Televisore;

public interface TelevisoreService {

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);

	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);

	public Televisore caricaSingolo(Long idInput) throws Exception;

	public int inserisci(Televisore televisoreInput) throws Exception;

	public List<Televisore> stampaTuttaLaLista() throws Exception;

	int rimuovi(Televisore televisoreInput) throws Exception;

	public int aggiorna(Televisore televisoreInput) throws Exception;
}