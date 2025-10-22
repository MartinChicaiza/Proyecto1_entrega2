package tiquetes;

public class Tiquete {
	
	
    // Atributos
    protected String id;                
    protected double precioVenta;         
    protected double pagoCargo;              
    protected double cuotaEmision;          
    protected boolean isContained;           
    protected Localidad localidadTiquete;    
    protected String type;                    
    protected PaqueteDeluxe paqueteAsociado; 
    protected String ownerLogin;             
    protected String estado;                
    protected String idOrden;                
    protected int asiento;                    
    protected double precioBase;              
    protected double cargoServicioAplicado;   
    protected double cuotaEmisionAplicada;   
    protected String fechaEmision;            

    
    // Constructor
    public Tiquete(String id, double precioVenta, double pagoCargo, double cuotaEmision,
                   boolean isContained, String type) {
        this.id = id;
        this.precioVenta = precioVenta;
        this.pagoCargo = pagoCargo;
        this.cuotaEmision = cuotaEmision;
        this.isContained = isContained;
        this.type = type;
        this.estado = "ACTIVO";
        this.fechaEmision = java.time.LocalDateTime.now().toString();
    }

    
    // Métodos
    public double totalPagado() {
        return precioBase + cargoServicioAplicado + cuotaEmisionAplicada;
    }

    public boolean esTransferible() {
        
        return paqueteAsociado == null;
    }

    public boolean estaVencido(java.time.LocalDateTime ahora) {
        java.time.LocalDateTime emision = java.time.LocalDateTime.parse(fechaEmision);
        return emision.plusMonths(6).isBefore(ahora); 
    }

    public void marcarReembolsado() {
        this.estado = "REEMBOLSADO";
    }

    public void marcarTransferido(String nuevoOwner) {
        this.ownerLogin = nuevoOwner;
        this.estado = "TRANSFERIDO";
    }

    public void validarPropietario(String login) {
        if (!this.ownerLogin.equals(login)) {
            throw new IllegalArgumentException("El usuario no es el propietario del tiquete");
        }
    }

    
    public String getId() { return id; }
    public String getOwnerLogin() { return ownerLogin; }
    public String getEstado() { return estado; }
    public double getPrecioVenta() { return precioVenta; }
    public Localidad getLocalidadTiquete() { return localidadTiquete; }

    public void setLocalidadTiquete(Localidad localidadTiquete) {
        this.localidadTiquete = localidadTiquete;
    }
}

}
