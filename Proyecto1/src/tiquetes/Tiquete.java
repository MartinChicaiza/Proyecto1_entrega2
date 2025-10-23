package tiquetes;

import eventos.Localidad;

public abstract class Tiquete {
	
	protected String id;
	protected double precioVenta;
	protected double pagoCargo;
	protected static double cuotaEmision;
	protected boolean isContained;
	protected Localidad localidadTiquete;
	protected String type;
	protected PaqueteDeluxe paqueteAsociado;
	
	
	public Tiquete(String id, double precioVenta, double pagoCargo, boolean isContained,
			String type) {
		super();
		this.id = id;
		this.precioVenta = precioVenta;
		this.pagoCargo = pagoCargo;
		this.isContained = isContained;
		this.type = type;
	}

}
