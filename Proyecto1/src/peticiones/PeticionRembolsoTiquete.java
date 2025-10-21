package peticiones;
import tiquetes.Tiquete;

public class PeticionRembolsoTiquete extends Peticion{

	private Tiquete tiqueteACancelar;

	public PeticionRembolsoTiquete(String id, String tipoPeticion, Tiquete tiqueteACancelar) {
		super(id, "reembolsarTiquete");
		this.tiqueteACancelar = tiqueteACancelar;
	}
	
	

}
