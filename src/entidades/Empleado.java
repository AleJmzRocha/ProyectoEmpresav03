package entidades;

import conexionmysql.Conexion;
import daoentidades.EmpleadoDAO;
import java.sql.*;
import javax.swing.JOptionPane;

public class Empleado implements EmpleadoDAO {

    Integer idEmpleado, telefonoCelular, numeroEmergencia, idDepartamento;
    String nombrePila, apellidoPaterno, apellidoMaterno, direccion, estado;
    Conexion con;

    public Empleado() {
        con = new Conexion();
    }

    public Empleado(Integer idEmpleado, String nombrePila, String apellidoPaterno, String apellidoMaterno,
            String direccion, Integer telefonoCelular, Integer numeroEmergencia, Integer idDepartamento,
            String estado) {
        this.idEmpleado = idEmpleado;
        this.telefonoCelular = telefonoCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.estado = estado;
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(Integer telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Integer getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(Integer numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public void NuevoEmpleado(Empleado empleado) {
        try {
            try (PreparedStatement pstm = con.getConnection()
                    .prepareStatement("insert into "
                            + "empleado(idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado) "
                            + "values(?,?,?,?,?,?,?,?,?)")) {
                pstm.setInt(1, empleado.getIdEmpleado());
                pstm.setString(2, empleado.getNombrePila());
                pstm.setString(3, empleado.getApellidoPaterno());
                pstm.setString(4, empleado.getApellidoMaterno());
                pstm.setString(5, empleado.getDireccion());
                pstm.setInt(6, empleado.getTelefonoCelular());
                pstm.setInt(7, empleado.getNumeroEmergencia());
                pstm.setInt(8, empleado.getIdDepartamento());
                pstm.setString(9, empleado.getEstado());
                pstm.execute();
                pstm.close();
            }
            JOptionPane.showMessageDialog(null, "Registro exitoso.");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @Override
    public Object[][] getDatos() {
        Integer registros = 0;
        // obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT count(idEmpleado) as total FROM empleado ");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[][] data = new String[registros][9];
        // realizamos la consulta sql y llenamos los datos en "Object"
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT "
                            + " idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado"
                            + " FROM empleado" + " ORDER BY idEmpleado ");
            ResultSet res = pstm.executeQuery();
            Integer i = 0;
            while (res.next()) {
                String idemp = res.getString("idEmpleado");
                String nompila = res.getString("nombrePila");
                String apaterno = res.getString("apellidoPaterno");
                String amaterno = res.getString("apellidoMaterno");
                String direccion = res.getString("direccion");
                String telcel = res.getString("telefonoCelular");
                String numem = res.getString("numeroEmergencia");
                String idepa = res.getString("idDepartamento");
                String estado = res.getString("estado");
                data[i][0] = idemp;
                data[i][1] = nompila;
                data[i][2] = apaterno;
                data[i][3] = amaterno;
                data[i][4] = direccion;
                data[i][5] = telcel;
                data[i][6] = numem;
                data[i][7] = idepa;
                data[i][8] = estado;
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    @Override
    public Object[][] verActuales() {
        Integer registros = 0;
        // obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT count(idEmpleado) as total FROM empleado ");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[][] data = new String[registros][9];
        // realizamos la consulta sql y llenamos los datos en "Object"
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT "
                            + " idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado"
                            + " FROM empleado where estado = 'Alta' " + " ORDER BY idEmpleado ");
            ResultSet res = pstm.executeQuery();
            Integer i = 0;
            while (res.next()) {
                String idemp = res.getString("idEmpleado");
                String nompila = res.getString("nombrePila");
                String apaterno = res.getString("apellidoPaterno");
                String amaterno = res.getString("apellidoMaterno");
                String direccion = res.getString("direccion");
                String telcel = res.getString("telefonoCelular");
                String numem = res.getString("numeroEmergencia");
                String idepa = res.getString("idDepartamento");
                String estado = res.getString("estado");
                data[i][0] = idemp;
                data[i][1] = nompila;
                data[i][2] = apaterno;
                data[i][3] = amaterno;
                data[i][4] = direccion;
                data[i][5] = telcel;
                data[i][6] = numem;
                data[i][7] = idepa;
                data[i][8] = estado;
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    @Override
    public Object[][] buscarEmpleado(String cod) {
        //Componer
        Integer registros = 0;
        // obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT count(idEmpleado) as total FROM empleado ");
            try (ResultSet res = pstm.executeQuery()) {
                res.next();
                registros = res.getInt("total");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        Object[][] data = new String[registros][9];
        // realizamos la consulta sql y llenamos los datos en "Object"
        try {
            PreparedStatement pstm = con.getConnection()
                    .prepareStatement("SELECT "
                            + " idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado"
                            + " FROM empleado where estado = 'Alta' " + " ORDER BY idEmpleado ");
            ResultSet res = pstm.executeQuery();
            Integer i = 0;
            while (res.next()) {
                String idemp = res.getString("idEmpleado");
                String nompila = res.getString("nombrePila");
                String apaterno = res.getString("apellidoPaterno");
                String amaterno = res.getString("apellidoMaterno");
                String direccion = res.getString("direccion");
                String telcel = res.getString("telefonoCelular");
                String numem = res.getString("numeroEmergencia");
                String idepa = res.getString("idDepartamento");
                String estado = res.getString("estado");
                data[i][0] = idemp;
                data[i][1] = nompila;
                data[i][2] = apaterno;
                data[i][3] = amaterno;
                data[i][4] = direccion;
                data[i][5] = telcel;
                data[i][6] = numem;
                data[i][7] = idepa;
                data[i][8] = estado;
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }

    @Override
    public void darBaja(String idEmpleado) {
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("update empleado "
                    + "set estado = 'Baja' "
                    + "where idEmpleado = ? ");
            pstm.setString(1, idEmpleado);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
