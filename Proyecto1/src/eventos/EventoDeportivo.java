package eventos;

public class EventoDeportivo extends Evento{

	@Override
	public String setTipoEvento() {
		this.tipoEvento = "Deportivo";
		return null;
	}

}
