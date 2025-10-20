package usuarios;

public class Admin extends Usuario{

	
	@Override
	public String setTipoUsuario() {
		this.tipoUsuario = "A";
		return null;
	}

}
