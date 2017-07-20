package entidades;

import java.sql.Time;

public class HorarioEmpleado {
	Administrador idAdministrador;
	Empleado idEmpleado;
	Time horarioLunesEntrada, horarioMartesEntrada, horarioMiercolesEntrada, horarioJuevesEntrada,
			horarioViernesEntrada, horarioSabadoEntrada;
	Time horarioLunesSalida, horarioMartesSalida, horarioMiercolesSalida, horarioJuevesSalida, horarioViernesSalida,
			horarioSabadoSalida;

	public HorarioEmpleado(Empleado idEmpleado, Time horarioLunesEntrada, Time horarioLunesSalida,
			Time horarioMartesEntrada, Time horarioMartesSalida, Time horarioMiercolesEntrada,
			Time horarioMiercolesSalida, Time horarioJuevesEntrada, Time horarioJuevesSalida,
			Time horarioViernesEntrada, Time horarioViernesSalida, Time horarioSabadoEntrada,
			Time horarioSabadoSalida) {
		this.idEmpleado = idEmpleado;
		this.horarioLunesEntrada = horarioLunesEntrada;
		this.horarioMartesEntrada = horarioMartesEntrada;
		this.horarioMiercolesEntrada = horarioMiercolesEntrada;
		this.horarioJuevesEntrada = horarioJuevesEntrada;
		this.horarioViernesEntrada = horarioViernesEntrada;
		this.horarioSabadoEntrada = horarioSabadoEntrada;
		this.horarioLunesSalida = horarioLunesSalida;
		this.horarioMartesSalida = horarioMartesSalida;
		this.horarioMiercolesSalida = horarioMiercolesSalida;
		this.horarioJuevesSalida = horarioJuevesSalida;
		this.horarioViernesSalida = horarioViernesSalida;
		this.horarioSabadoSalida = horarioSabadoSalida;
	}

	public HorarioEmpleado(Administrador idAdministrador, Time horarioLunesEntrada, Time horarioLunesSalida,
			Time horarioMartesEntrada, Time horarioMartesSalida, Time horarioMiercolesEntrada,
			Time horarioMiercolesSalida, Time horarioJuevesEntrada, Time horarioJuevesSalida,
			Time horarioViernesEntrada, Time horarioViernesSalida, Time horarioSabadoEntrada,
			Time horarioSabadoSalida) {
		this.idAdministrador = idAdministrador;
		this.horarioLunesEntrada = horarioLunesEntrada;
		this.horarioMartesEntrada = horarioMartesEntrada;
		this.horarioMiercolesEntrada = horarioMiercolesEntrada;
		this.horarioJuevesEntrada = horarioJuevesEntrada;
		this.horarioViernesEntrada = horarioViernesEntrada;
		this.horarioSabadoEntrada = horarioSabadoEntrada;
		this.horarioLunesSalida = horarioLunesSalida;
		this.horarioMartesSalida = horarioMartesSalida;
		this.horarioMiercolesSalida = horarioMiercolesSalida;
		this.horarioJuevesSalida = horarioJuevesSalida;
		this.horarioViernesSalida = horarioViernesSalida;
		this.horarioSabadoSalida = horarioSabadoSalida;
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

	public Time getHorarioLunesEntrada() {
		return horarioLunesEntrada;
	}

	public void setHorarioLunesEntrada(Time horarioLunesEntrada) {
		this.horarioLunesEntrada = horarioLunesEntrada;
	}

	public Time getHorarioMartesEntrada() {
		return horarioMartesEntrada;
	}

	public void setHorarioMartesEntrada(Time horarioMartesEntrada) {
		this.horarioMartesEntrada = horarioMartesEntrada;
	}

	public Time getHorarioMiercolesEntrada() {
		return horarioMiercolesEntrada;
	}

	public void setHorarioMiercolesEntrada(Time horarioMiercolesEntrada) {
		this.horarioMiercolesEntrada = horarioMiercolesEntrada;
	}

	public Time getHorarioJuevesEntrada() {
		return horarioJuevesEntrada;
	}

	public void setHorarioJuevesEntrada(Time horarioJuevesEntrada) {
		this.horarioJuevesEntrada = horarioJuevesEntrada;
	}

	public Time getHorarioViernesEntrada() {
		return horarioViernesEntrada;
	}

	public void setHorarioViernesEntrada(Time horarioViernesEntrada) {
		this.horarioViernesEntrada = horarioViernesEntrada;
	}

	public Time getHorarioSabadoEntrada() {
		return horarioSabadoEntrada;
	}

	public void setHorarioSabadoEntrada(Time horarioSabadoEntrada) {
		this.horarioSabadoEntrada = horarioSabadoEntrada;
	}

	public Time getHorarioLunesSalida() {
		return horarioLunesSalida;
	}

	public void setHorarioLunesSalida(Time horarioLunesSalida) {
		this.horarioLunesSalida = horarioLunesSalida;
	}

	public Time getHorarioMartesSalida() {
		return horarioMartesSalida;
	}

	public void setHorarioMartesSalida(Time horarioMartesSalida) {
		this.horarioMartesSalida = horarioMartesSalida;
	}

	public Time getHorarioMiercolesSalida() {
		return horarioMiercolesSalida;
	}

	public void setHorarioMiercolesSalida(Time horarioMiercolesSalida) {
		this.horarioMiercolesSalida = horarioMiercolesSalida;
	}

	public Time getHorarioJuevesSalida() {
		return horarioJuevesSalida;
	}

	public void setHorarioJuevesSalida(Time horarioJuevesSalida) {
		this.horarioJuevesSalida = horarioJuevesSalida;
	}

	public Time getHorarioViernesSalida() {
		return horarioViernesSalida;
	}

	public void setHorarioViernesSalida(Time horarioViernesSalida) {
		this.horarioViernesSalida = horarioViernesSalida;
	}

	public Time getHorarioSabadoSalida() {
		return horarioSabadoSalida;
	}

	public void setHorarioSabadoSalida(Time horarioSabadoSalida) {
		this.horarioSabadoSalida = horarioSabadoSalida;
	}
}
