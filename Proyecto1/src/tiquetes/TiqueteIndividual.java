package tiquetes;

public class TiqueteIndividual extends Tiquete {
	
	private int idAsiento;
	private TiqueteMultiple tiqueteAsociado;
	public TiqueteIndividual(String id, double precioVenta, double pagoCargo, boolean isContained,
			int idAsiento) {
		super(id, precioVenta, pagoCargo, isContained, "Individual");
		this.idAsiento = idAsiento;
	}
	
	
	
	

}
