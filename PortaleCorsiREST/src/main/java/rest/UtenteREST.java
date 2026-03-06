package rest;

import jakarta.ejb.EJB;
import jakarta.ws.rs.Consumes;
<<<<<<< HEAD
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.entity.Utente;
import service.IUtenteService;
=======
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.entity.Utente;
import service.UtenteService;
>>>>>>> e64a9d191fd9ac9130f762a6ab119f7b36c7adc6

@Path("/utente")
public class UtenteREST {

	@EJB
<<<<<<< HEAD
	private IUtenteService iUtenteService;

	@POST
	@Path("/creaUtente")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response creaUtente(Utente utente) {
		iUtenteService.creaUtente(utente);

		return Response.status(201).build();
	}
	
	@GET
	@Path("/test")
	@Produces("text/plain")
	public String test() {
	    return "REST funziona";
	}
=======
	private UtenteService utenteService;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response creaUtente(Utente utente) {
		utenteService.creaUtente(utente);
		
		return Response.status(201).build();
	}
>>>>>>> e64a9d191fd9ac9130f762a6ab119f7b36c7adc6
}
