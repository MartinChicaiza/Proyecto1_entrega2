package eventos;

public class EventoMusical extends Evento{

	@Override
	public String setTipoEvento() {
		this.tipoEvento = "Musical";
		return null;
	}

}
