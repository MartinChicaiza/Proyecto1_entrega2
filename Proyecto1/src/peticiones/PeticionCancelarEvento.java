package peticiones;
import eventos.Evento;
public class PeticionCancelarEvento extends Peticion{

	private Evento eventoACancelar;

	public PeticionCancelarEvento(String id, Evento eventoACancelar) {
		super(id, "cancelarEvento");
		this.eventoACancelar = eventoACancelar;
	}
	
	
	

}
