/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package el.ahorcado.Principal;

import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author samgomgom
 */
public class CONECCIONBD {
    public static void main(String[] args) {
        try {
            Connection conn = modeloBD.obtenerConexion(); 
            System.out.println("✅ Conexión exitosa a la base de datos.");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos:");
            e.printStackTrace();
        }
    }
}

