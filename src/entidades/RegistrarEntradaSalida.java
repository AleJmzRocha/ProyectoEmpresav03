package entidades;

import java.sql.Time;
import java.util.Date;

public class RegistrarEntradaSalida {
	Empleado idEmpleado;
	Administrador idAdministrador;
	Date registrarDia;
	Time registrarEntrada, registrarSalida;

	public RegistrarEntradaSalida(Administrador idAdministrador, Date registrarDia, Time registrarEntrada,
			Time registrarSalida) {
		this.idAdministrador = idAdministrador;
		this.registrarDia = registrarDia;
		this.registrarEntrada = registrarEntrada;
		this.registrarSalida = registrarSalida;
	}

	public RegistrarEntradaSalida(Empleado idEmpleado, Date registrarDia, Time registrarEntrada, Time registrarSalida) {
		this.idEmpleado = idEmpleado;
		this.registrarDia = registrarDia;
		this.registrarEntrada = registrarEntrada;
		this.registrarSalida = registrarSalida;
	}

	public Empleado getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Empleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Administrador getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(Administrador idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public Date getRegistrarDia() {
		return registrarDia;
	}

	public void setRegistrarDia(Date registrarDia) {
		this.registrarDia = registrarDia;
	}

	public Time getRegistrarEntrada() {
		return registrarEntrada;
	}

	public void setRegistrarEntrada(Time registrarEntrada) {
		this.registrarEntrada = registrarEntrada;
	}

	public Time getRegistrarSalida() {
		return registrarSalida;
	}

	public void setRegistrarSalida(Time registrarSalida) {
		this.registrarSalida = registrarSalida;
	}
}
