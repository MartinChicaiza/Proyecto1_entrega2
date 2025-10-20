package peticiones;
import venue.Venue;

public class PeticionNuevoVenue extends Peticion{

	private Venue venueCandidato;
	
	@Override
	public String setTipoPeticion() {
		this.tipoPeticion = "Venue";
		return null;
	}
	
	

}
