package conexionmysql;

import java.sql.*;

public class Conexion {

    static String bd = "empresa";
    static String login = "root";
    static String password = "alejandra";
    static String url = "jdbc:mysql://localhost/" + bd;

    Connection conn = null;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
//                System.out.println("Conexión a base de datos " + bd + ". listo");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        conn = null;
    }
}
