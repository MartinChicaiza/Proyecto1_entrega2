package peticiones;
import venue.Venue;

public class PeticionNuevoVenue extends Peticion{

	private Venue venueCandidato;

	public PeticionNuevoVenue(String id, String tipoPeticion, Venue venueCandidato) {
		super(id, "creacionVenue");
		this.venueCandidato = venueCandidato;
	}
	
	
	

}
