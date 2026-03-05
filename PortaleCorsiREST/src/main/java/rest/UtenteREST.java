package rest;

import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.entity.Utente;
import service.UtenteService;

@Path("/utente")
public class UtenteREST {

	@EJB
	private UtenteService utenteService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response creaUtente(Utente utente) {
		utenteService.creaUtente(utente);
		
		return Response.status(201).build();
	}
}
