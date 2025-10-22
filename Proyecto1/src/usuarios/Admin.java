package usuarios;

public class Admin extends Usuario{

	private static GananciasBoleteria gananciasBoleteria;

	public Admin(String tipoUsuario, String login, String contrasena) {
		super(tipoUsuario, login, contrasena);
	}

	public static GananciasBoleteria getGananciasBoleteria() {
		return gananciasBoleteria;
	}

	public static void setGananciasBoleteria(GananciasBoleteria gananciasBoleteria) {
		Admin.gananciasBoleteria = gananciasBoleteria;
	}
	
	
	
}
