package it.prova.service.televisore;

import java.util.List;

import it.prova.dao.televisore.TelevisoreDAO;
import it.prova.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService {


	private TelevisoreDAO televisoreDAO;

	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		this.televisoreDAO = televisoreDAO;
	}

	
	@Override
	public List<Televisore> stampaTuttaLaLista() throws Exception {
	
		return televisoreDAO.list();
	}
	
	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		// televisoreDAO.setConnection(MyConnection.getConnection());
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisore caricaSingolo(Long idInput) throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.get(idInput);
	}


	@Override
	public int inserisci(Televisore televisoreInput) throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.insert(televisoreInput);
	}
	
	@Override
	public int rimuovi(Televisore televisoreInput) throws Exception {
		return televisoreDAO.delete(televisoreInput);
	}
	
	public int  aggiorna(Televisore televisoreInput) throws Exception {
		
		return televisoreDAO.update(televisoreInput);		
	}


	
}
