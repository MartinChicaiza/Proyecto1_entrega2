package tiquetes;

import java.util.TreeMap;

public class TiqueteMultiple extends Tiquete{
	private boolean isCompleto;
	private TreeMap<String, TiqueteIndividual> tiquetes;
	
	public TiqueteMultiple(String id, double precioVenta, double pagoCargo, boolean isContained,
			boolean isCompleto, TreeMap<String, TiqueteIndividual> tiquetes) {
		super(id, precioVenta, pagoCargo, isContained, "Multiple");
		this.isCompleto = isCompleto;
		this.tiquetes = tiquetes;
	}
	
	

}
