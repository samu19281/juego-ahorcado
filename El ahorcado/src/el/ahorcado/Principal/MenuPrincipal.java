
package el.ahorcado.Principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.vistaInicial;
import el.ahorcado.Principal.InicioJuego;
import el.ahorcado.Principal.AbrirJuego;

public class MenuPrincipal extends JFrame {
    public MenuPrincipal(){
        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); 
        
        Container contentPane = getContentPane();
        contentPane.setBackground(new Color(173, 216, 230));

        
        JMenuBar menuBar = new JMenuBar();

       
        JMenu jugadorMenu = new JMenu("Jugador");

        JMenuItem nuevoJuegoItem = new JMenuItem("Nuevo juego");
        
        JMenuItem abrirjuegoItem = new JMenuItem("Abrir juego");
         abrirjuegoItem.addActionListener(e ->{
            dispose();
            AbrirJuego juego = new AbrirJuego();
            juego.setVisible(true);
        });
        
        JMenuItem verInformeItem = new JMenuItem("Ver informe");
        JMenuItem salirItem = new JMenuItem("Salir");

        jugadorMenu.add(nuevoJuegoItem);
        jugadorMenu.add(abrirjuegoItem);
        jugadorMenu.add(verInformeItem);
        jugadorMenu.addSeparator(); 
        jugadorMenu.add(salirItem);

        
        JMenu administradorMenu = new JMenu("Administrador");

        JMenuItem importarDiccionarioItem = new JMenuItem("Importar Diccionario");
        JMenuItem consultarInformeItem = new JMenuItem("Consultar informe");
        JMenuItem anadirEliminarIdiomaItem = new JMenuItem("Añadir/Eliminar idioma");
        JMenuItem copiaSeguridadItem = new JMenuItem("Copia de seguridad");
        JMenuItem restauracionItem = new JMenuItem("Restauración");
        JMenuItem gestionPalabraFraseItem = new JMenuItem("Gestión palabra/Frase");
        JMenuItem gestionUsuariosItem = new JMenuItem("Gestión usuarios");

        administradorMenu.add(importarDiccionarioItem);
        administradorMenu.add(consultarInformeItem);
        administradorMenu.add(anadirEliminarIdiomaItem);
        administradorMenu.add(copiaSeguridadItem);
        administradorMenu.add(restauracionItem);
        administradorMenu.add(gestionPalabraFraseItem);
        administradorMenu.add(gestionUsuariosItem);

        
        menuBar.add(jugadorMenu);
        menuBar.add(administradorMenu);

        
        setJMenuBar(menuBar);

       
        JLabel welcomeLabel = new JLabel("¡Bienvenido al Juego del Ahorcado!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 22));
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(welcomeLabel, BorderLayout.CENTER);

      salirItem.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       setVisible(false); 
    }
});

// Acción para nuevo juego
nuevoJuegoItem.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
       new InicioJuego();  // Mostrar nueva ventana de juego
        setVisible(false);
    }
});

         
        setVisible(true);
    }
   
}
