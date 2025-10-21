package peticiones;

public abstract class Peticion {
	
	protected String id;
	protected String tipoPeticion;
	
	
	
	public Peticion(String id, String tipoPeticion) {
		super();
		this.id = id;
		this.tipoPeticion = tipoPeticion;
	}

}
