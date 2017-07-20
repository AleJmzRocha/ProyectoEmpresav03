package entidades;

import conexionmysql.Conexion;
import daoentidades.DepartamentoDAO;
import java.sql.*;
import java.util.Date;

public class Departamento implements DepartamentoDAO {

    Integer idDepartamento;
    String nombreDepartamento, ubicacion;
    Date horario;
    Conexion con;

    public Departamento(Integer idDepartamento, String nombreDepartamento, String ubicacion, Date horario) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.ubicacion = ubicacion;
        this.horario = horario;
    }
    
    public Departamento(){
        con = new Conexion();
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public String[] getDepartamento() {
        Integer registros = 0;
        // obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT count(idDepartamento) as total FROM departamento ");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        String[] data = new String[registros];
        // realizamos la consulta sql y llenamos los datos en "Object"
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT "
                            + " nombreDepartamento"
                            + " FROM departamento" + " ORDER BY idDepartamento ");
            ResultSet res = pstm.executeQuery();
            Integer i = 0;
            while (res.next()) {
                String nomdepa = res.getString("nombreDepartamento");
                data[i] = nomdepa;
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
}
