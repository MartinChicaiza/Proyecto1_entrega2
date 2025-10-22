package usuarios;

public abstract class Usuario {

	protected String tipoUsuario;
	protected String login;
	protected String contrasena;
	public Usuario(String tipoUsuario, String login, String contrasena) {
		super();
		this.tipoUsuario = tipoUsuario;
		this.login = login;
		this.contrasena = contrasena;
	}
	
	
	
	
	

	
}
