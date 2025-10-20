package eventos;

public class EventoReligioso extends Evento{
	

	@Override
	public String setTipoEvento() {
		this.tipoEvento = "Religioso";
		return null;
	}

}
