/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el.ahorcado.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author samgomgom
 */
public class modeloBD {
    private static final String URL = "jdbc:mysql://localhost:3306/JuegoElAhorcado";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "abcd1234";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }
}
