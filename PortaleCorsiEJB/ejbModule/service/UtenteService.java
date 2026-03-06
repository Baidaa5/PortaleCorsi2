package service;

import dao.dao.UtenteDAO;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import model.entity.Utente;

@Stateless
public class UtenteService {
	
	@EJB
	private UtenteDAO utenteDAO;
	
	
	public void creaUtente(Utente utente) {
		utenteDAO.insert(utente);
	}
}
