/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import el.ahorcado.Principal.InicioJuego;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import modelo.formulaRegistro;
import el.ahorcado.Principal.MenuPrincipal;




public class vistaInicial extends JFrame {
    public vistaInicial()
    {
      JFrame frame = new JFrame("Juego el ahorcado");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
       

        // Crear el panel con GridBagLayout
        JPanel panel = new JPanel();
        panel.setBackground(new Color(59, 141, 204));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 5, 5); // Espaciado de los  componentes

        // Título
        JLabel titleLabel = new JLabel("LOGIN");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        // nombre completo
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Username:"), gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 1;
        JTextField usernameField = new JTextField(10);
        panel.add(usernameField, gbc);

        // contraseña
    
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Password:"), gbc);
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.gridx = 1;
        JPasswordField passwordField = new JPasswordField(10);
        panel.add(passwordField, gbc);
        
        
        // autenticarse
         gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 0;
        JButton autenticarseButton = new JButton("ENTRAR");
        gbc.gridx = 2;
        panel.add(autenticarseButton, gbc);
        autenticarseButton.addActionListener(e ->{
            dispose();
            MenuPrincipal Principal = new MenuPrincipal();
            Principal.setVisible(true);
        });

        // Recordar contraseña y registro
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JPanel linkPanel = new JPanel();
        linkPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        linkPanel.add(new JLabel("<html><u>Recordar contraseña</u></html>"));
        linkPanel.add(new JLabel("  |  "));
        JButton registroButton = new JButton("Registrese aqui");
       gbc.gridx = 1;
        panel.add(registroButton, gbc);
        registroButton.addActionListener(e ->{
            dispose();
          formulaRegistro formulaRegistro1 = new formulaRegistro();
          formulaRegistro1.setVisible(true);
            
                });
       

        // Campo Email
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        JTextField emailField = new JTextField(10);
        panel.add(emailField, gbc);
        
        
        // documentacion
        gbc.gridy = 10;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(new JLabel("documentacion"), gbc);
        JButton documentacionButton = new JButton("pinche aqui");
        gbc.gridx = 1;
        panel.add(documentacionButton, gbc);
        
        
        

        //   panel frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
