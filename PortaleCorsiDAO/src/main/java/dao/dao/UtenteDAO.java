package dao.dao;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import model.entity.Utente;

@Stateless
public class UtenteDAO {
<<<<<<< HEAD
	
=======
>>>>>>> e64a9d191fd9ac9130f762a6ab119f7b36c7adc6
	//unitName combacia con il nome del persist-unit
	@PersistenceContext(unitName = "PortaleCorsiDAO")						//inietto EntityManager
	private EntityManager entityManager;
	
	public void insert(Utente utente) {
		entityManager.persist(utente);
	}
	
	public Utente find(Long id) {
		return entityManager.find(Utente.class, id);
	}
	
	
	
}
<<<<<<< HEAD

=======
>>>>>>> e64a9d191fd9ac9130f762a6ab119f7b36c7adc6
