package usuarios;

public class Cliente extends Usuario{

	private double saldo;
	private int cantidadPeticiones;
	
	@Override
	public String setTipoUsuario() {
		this.tipoUsuario = "C";
		return null;
	}
	
	

}
