package eventos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.TreeMap;

import usuarios.Organizador;
import venue.Venue;

public abstract class Evento {
	
	protected String nombre;
	protected LocalDate fecha;
	protected LocalTime hora;
	protected String tipoEvento;
	protected double cargoPorcentual;
	protected int cantidadBoletas;
	protected TreeMap<String, Localidad> localidades; 
	protected Venue venue;
	protected Organizador organizador;
	
	
	
	public abstract String setTipoEvento();
}
