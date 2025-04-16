
package el.ahorcado.Principal;
import javax.swing.*;
import java.awt.*;
import vista.vistaInicial;
import java.awt.event.*;


public class InicioJuego extends JFrame {
   
    public InicioJuego() {
        setTitle("JUEGO NUEVO");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null); 
         panel.setBackground(new Color(173, 216, 230)); 
       panel.setLayout(null);
        add(panel); 

        // Título
        JLabel titulo = new JLabel("JUEGO NUEVO");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(180, 10, 200, 30);
        panel.add(titulo);

        // Tipo
        JLabel tipoLabel = new JLabel("Tipo");
        tipoLabel.setBounds(30, 50, 50, 20);
        panel.add(tipoLabel);

        JRadioButton palabrasBtn = new JRadioButton("Palabras");
        palabrasBtn.setBounds(100, 50, 100, 20);
        JRadioButton frasesBtn = new JRadioButton("Frases");
        frasesBtn.setBounds(220, 50, 100, 20);

        ButtonGroup tipoGroup = new ButtonGroup();
        tipoGroup.add(palabrasBtn);
        tipoGroup.add(frasesBtn);

        panel.add(palabrasBtn);
        panel.add(frasesBtn);

        // Número de jugadores
        JLabel jugadoresLabel = new JLabel("Número jugadores:");
        jugadoresLabel.setBounds(30, 90, 130, 20);
       JComboBox<Integer> NumerojugadoresComboBox = new JComboBox<>();
        NumerojugadoresComboBox.addItem(1);
        NumerojugadoresComboBox.addItem(2);
        NumerojugadoresComboBox.addItem(3);
        NumerojugadoresComboBox.addItem(4);
        NumerojugadoresComboBox.addItem(5);
        NumerojugadoresComboBox.setBounds(160, 90, 60, 20);
        panel.add(NumerojugadoresComboBox);
        panel.add(jugadoresLabel);
       

        // Nivel dificultad
        JLabel nivelLabel = new JLabel("Nivel Dificultad:");
        nivelLabel.setBounds(250, 90, 120, 20);
        JComboBox<String>NivelComboBox = new JComboBox<>();
        NivelComboBox.addItem("Facil");
        NivelComboBox.addItem("Medio");
        NivelComboBox.addItem("Dificil");
        NivelComboBox.setBounds(350, 90, 90, 20);
        panel.add(nivelLabel);
        panel.add(NivelComboBox);
       


        // Idioma
        JLabel dificultadLabel = new JLabel("Idioma:");
        dificultadLabel.setBounds(30, 250, 100, 20);
         JComboBox<String>IdiomaComboBox = new JComboBox<>();
         IdiomaComboBox.addItem("Castellano");
        IdiomaComboBox.addItem("Valenciano");
        IdiomaComboBox.addItem("Ingles");
        IdiomaComboBox.addItem("Frances");
         IdiomaComboBox.setBounds(90, 250, 100, 20);
        panel.add(dificultadLabel);
         panel.add(IdiomaComboBox);
        
       

        // Botones
        JButton okButton = new JButton("OK");
        okButton.setBounds(250, 400, 80, 30);
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setBounds(340, 400, 80, 30);
        panel.add(okButton);
        panel.add(cancelButton);
        
 
        
      // Botón para regresar al menú principal
        JButton volverBtn = new JButton("Volver al Menú Principal");
        volverBtn.setBounds(50, 400, 160, 30);
        volverBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);  // Ocultar la ventana de inicio del juego
                dispose();  // Cerrar la ventana actual (InicioJuego)
                new MenuPrincipal();  // Mostrar la ventana principal nuevamente
            }
        });
        panel.add(volverBtn);

        setVisible(true);
}
}

