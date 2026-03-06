package serviceImpl;

import dao.dao.UtenteDAO;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import model.entity.Utente;
import service.IUtenteService;

@Stateless
public class UtenteServiceImpl implements IUtenteService{
	
	@EJB
	private UtenteDAO utenteDAO;

	@Override
	public void creaUtente(Utente utente) {
		utenteDAO.insert(utente);
		
	}

}
