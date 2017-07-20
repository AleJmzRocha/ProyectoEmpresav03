package entidades;

public class FaltasRetardos {
	Administrador idAdministrador;
	Empleado idEmpleado;
	Integer faltas, retardos, asistencias;

	public FaltasRetardos(Empleado idEmpleado, Integer faltas, Integer retardos, Integer asistencias) {
		super();
		this.idEmpleado = idEmpleado;
		this.faltas = faltas;
		this.retardos = retardos;
		this.asistencias = asistencias;
	}

	public FaltasRetardos(Administrador idAdministrador, Integer faltas, Integer retardos, Integer asistencias) {
		super();
		this.idAdministrador = idAdministrador;
		this.faltas = faltas;
		this.retardos = retardos;
		this.asistencias = asistencias;
	}

	public Administrador getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(Administrador idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public Empleado getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Empleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Integer getFaltas() {
		return faltas;
	}

	public void setFaltas(Integer faltas) {
		this.faltas = faltas;
	}

	public Integer getRetardos() {
		return retardos;
	}

	public void setRetardos(Integer retardos) {
		this.retardos = retardos;
	}

	public Integer getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
	}
}
