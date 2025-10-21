package tiquetes;

import java.util.TreeMap;

public class PaqueteDeluxe {
	
	private String id;
	private double precio;
	private String mercancia;
	private String beneficios;
	private TreeMap<String, Tiquete> tiquetes;
	public PaqueteDeluxe(String id, double precio, String mercancia, String beneficios,
			TreeMap<String, Tiquete> tiquetes) {
		super();
		this.id = id;
		this.precio = precio;
		this.mercancia = mercancia;
		this.beneficios = beneficios;
		this.tiquetes = tiquetes;
	}
	
	

}
