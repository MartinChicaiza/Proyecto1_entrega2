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

}
