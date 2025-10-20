package eventos;
import java.util.Date;

public abstract class Evento {
	
	protected String nombre;
	protected Date fecha;
	protected String tipoEvento;
	protected double cargoPorcentual;
	protected int cantidadBoletas;
	
	public abstract String setTipoEvento();
}
