package venue;
import java.util.HashSet;
import java.time.LocalDate;

public class Venue {
	
	private String nombre;
	private double latitud;
	private double longitud;
	private int capacidad;
	private String restricciones;
	private HashSet<LocalDate> disponibilidad;
	private boolean aprobado;
	
	
	public Venue(String nombre, double latitud, double longitud, int capacidad, String restricciones,
			HashSet<LocalDate> disponibilidad, boolean aprobado) {
		super();
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.capacidad = capacidad;
		this.restricciones = restricciones;
		this.disponibilidad = disponibilidad;
		this.aprobado = aprobado;
	}
	
	

}
