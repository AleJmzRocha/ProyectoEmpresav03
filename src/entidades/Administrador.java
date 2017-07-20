package entidades;

public class Administrador extends Empleado {
	String password;

	public Administrador(Integer idEmpleado, String password, String nombrePila, String apellidoPaterno,
			String apellidoMaterno, String direccion, Integer telefonoCelular, Integer numeroEmergencia,
			Integer idDepartamento, String estado) {
		super(idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia,
				idDepartamento, estado);
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
