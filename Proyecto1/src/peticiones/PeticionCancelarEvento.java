package peticiones;
import eventos.Evento;
public class PeticionCancelarEvento extends Peticion{

	private Evento eventoACancelar;
	@Override
	public String setTipoPeticion() {
		this.tipoPeticion = "Cancelar";
		return null;
	}

}
