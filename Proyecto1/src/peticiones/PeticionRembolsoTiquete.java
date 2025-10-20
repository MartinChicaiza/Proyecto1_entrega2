package peticiones;
import tiquetes.Tiquete;

public class PeticionRembolsoTiquete extends Peticion{

	private Tiquete tiqueteACancelar;
	
	@Override
	public String setTipoPeticion() {
		this.tipoPeticion = "Rembolso";
		return null;
	}

}
