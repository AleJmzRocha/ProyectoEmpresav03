package conexionmysql;

import entidades.Empleado;
import java.sql.*;
import javax.swing.JOptionPane;

public class Ejecucion {

    Conexion con;

    public Ejecucion() {
        con = new Conexion();
    }

//    public void NuevoEmpleado(Empleado empleado) {
//        try {
//            try (PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("insert into "
//                            + "empleado(idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado) "
//                            + "values(?,?,?,?,?,?,?,?,?)")) {
//                pstm.setInt(1, empleado.getIdEmpleado());
//                pstm.setString(2, empleado.getNombrePila());
//                pstm.setString(3, empleado.getApellidoPaterno());
//                pstm.setString(4, empleado.getApellidoMaterno());
//                pstm.setString(5, empleado.getDireccion());
//                pstm.setInt(6, empleado.getTelefonoCelular());
//                pstm.setInt(7, empleado.getNumeroEmergencia());
//                pstm.setInt(8, empleado.getIdDepartamento());
//                pstm.setString(9, empleado.getEstado());
//                pstm.execute();
//                pstm.close();
//            }
//            JOptionPane.showMessageDialog(null, "Registro exitoso.");
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }

//    public Object[][] getDatos() {
//        Integer registros = 0;
//        // obtenemos la cantidad de registros existentes en la tabla
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT count(idEmpleado) as total FROM empleado ");
//            try (ResultSet res = pstm.executeQuery()) {
//                res.next();
//                registros = res.getInt("total");
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//        Object[][] data = new String[registros][9];
//        // realizamos la consulta sql y llenamos los datos en "Object"
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT "
//                            + " idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado"
//                            + " FROM empleado" + " ORDER BY idEmpleado ");
//            ResultSet res = pstm.executeQuery();
//            Integer i = 0;
//            while (res.next()) {
//                String idemp = res.getString("idEmpleado");
//                String nompila = res.getString("nombrePila");
//                String apaterno = res.getString("apellidoPaterno");
//                String amaterno = res.getString("apellidoMaterno");
//                String direccion = res.getString("direccion");
//                String telcel = res.getString("telefonoCelular");
//                String numem = res.getString("numeroEmergencia");
//                String idepa = res.getString("idDepartamento");
//                String estado = res.getString("estado");
//                data[i][0] = idemp;
//                data[i][1] = nompila;
//                data[i][2] = apaterno;
//                data[i][3] = amaterno;
//                data[i][4] = direccion;
//                data[i][5] = telcel;
//                data[i][6] = numem;
//                data[i][7] = idepa;
//                data[i][8] = estado;
//                i++;
//            }
//            res.close();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return data;
//    }

//    public String[] getDepartamento() {
//        Integer registros = 0;
//        // obtenemos la cantidad de registros existentes en la tabla
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT count(idDepartamento) as total FROM departamento ");
//            try (ResultSet res = pstm.executeQuery()) {
//                res.next();
//                registros = res.getInt("total");
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//        String[] data = new String[registros];
//        // realizamos la consulta sql y llenamos los datos en "Object"
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT "
//                            + " nombreDepartamento"
//                            + " FROM departamento" + " ORDER BY idDepartamento ");
//            ResultSet res = pstm.executeQuery();
//            Integer i = 0;
//            while (res.next()) {
//                String nomdepa = res.getString("nombreDepartamento");
//                data[i] = nomdepa;
//                i++;
//            }
//            res.close();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return data;
//    }

    public Boolean entrarAdministradorId(String idAministrador, String cod) {
        Boolean flag = false;
        try {
            PreparedStatement pstm = con.getConnection().prepareStatement("select idEmpleado, pass from administrador where idEmpleado = ? and pass = ?");
            pstm.setString(1, idAministrador);
            pstm.setString(2, cod);
            pstm.execute();
            pstm.close();
            flag = true;
        } catch (SQLException e) {
            System.out.println(e);
//            JOptionPane.showMessageDialog(null, "Número de administrador o contraseña incorrecta.");
        }
        return flag;
    }

//    public Object[][] verActuales() {
//        Integer registros = 0;
//        // obtenemos la cantidad de registros existentes en la tabla
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT count(idEmpleado) as total FROM empleado ");
//            try (ResultSet res = pstm.executeQuery()) {
//                res.next();
//                registros = res.getInt("total");
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//        Object[][] data = new String[registros][9];
//        // realizamos la consulta sql y llenamos los datos en "Object"
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT "
//                            + " idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado"
//                            + " FROM empleado where estado = 'Alta' " + " ORDER BY idEmpleado ");
//            ResultSet res = pstm.executeQuery();
//            Integer i = 0;
//            while (res.next()) {
//                String idemp = res.getString("idEmpleado");
//                String nompila = res.getString("nombrePila");
//                String apaterno = res.getString("apellidoPaterno");
//                String amaterno = res.getString("apellidoMaterno");
//                String direccion = res.getString("direccion");
//                String telcel = res.getString("telefonoCelular");
//                String numem = res.getString("numeroEmergencia");
//                String idepa = res.getString("idDepartamento");
//                String estado = res.getString("estado");
//                data[i][0] = idemp;
//                data[i][1] = nompila;
//                data[i][2] = apaterno;
//                data[i][3] = amaterno;
//                data[i][4] = direccion;
//                data[i][5] = telcel;
//                data[i][6] = numem;
//                data[i][7] = idepa;
//                data[i][8] = estado;
//                i++;
//            }
//            res.close();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return data;
//    }

//    public Object[][] buscarEmpleado(String cod) {
//        //Componer
//        Integer registros = 0;
//        // obtenemos la cantidad de registros existentes en la tabla
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT count(idEmpleado) as total FROM empleado ");
//            try (ResultSet res = pstm.executeQuery()) {
//                res.next();
//                registros = res.getInt("total");
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//
//        Object[][] data = new String[registros][9];
//        // realizamos la consulta sql y llenamos los datos en "Object"
//        try {
//            PreparedStatement pstm = con.getConnection()
//                    .prepareStatement("SELECT "
//                            + " idEmpleado, nombrePila, apellidoPaterno, apellidoMaterno, direccion, telefonoCelular, numeroEmergencia, idDepartamento, estado"
//                            + " FROM empleado where estado = 'Alta' " + " ORDER BY idEmpleado ");
//            ResultSet res = pstm.executeQuery();
//            Integer i = 0;
//            while (res.next()) {
//                String idemp = res.getString("idEmpleado");
//                String nompila = res.getString("nombrePila");
//                String apaterno = res.getString("apellidoPaterno");
//                String amaterno = res.getString("apellidoMaterno");
//                String direccion = res.getString("direccion");
//                String telcel = res.getString("telefonoCelular");
//                String numem = res.getString("numeroEmergencia");
//                String idepa = res.getString("idDepartamento");
//                String estado = res.getString("estado");
//                data[i][0] = idemp;
//                data[i][1] = nompila;
//                data[i][2] = apaterno;
//                data[i][3] = amaterno;
//                data[i][4] = direccion;
//                data[i][5] = telcel;
//                data[i][6] = numem;
//                data[i][7] = idepa;
//                data[i][8] = estado;
//                i++;
//            }
//            res.close();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return data;
//    }

//    public void darBaja(String idEmpleado) {
//        try {
//            PreparedStatement pstm = con.getConnection().prepareStatement("update empleado "
//                    + "set estado = 'Baja' "
//                    + "where idEmpleado = ? ");
//            pstm.setString(1, idEmpleado);
//            pstm.execute();
//            pstm.close();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//    }
}
