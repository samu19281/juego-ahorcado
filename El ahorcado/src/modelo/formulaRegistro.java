
package modelo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import vista.vistaInicial;
            
     public class formulaRegistro extends JFrame {

    public formulaRegistro() {
        setTitle("Formulario Registro");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        getContentPane().setBackground(new Color(173, 216, 230)); 

       
        JLabel lblNombre = new JLabel("Nombre:");
        JTextField txtNombre = new JTextField(15);

        JLabel lblApellidos = new JLabel("Apellidos:");
        JTextField txtApellidos = new JTextField(15);

        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField(15);

        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField(15);

        JLabel lblEmail = new JLabel("email:");
        JTextField txtEmail = new JTextField(15);

        JLabel lblCuenta = new JLabel("número Cta:");
        JTextField txtCuenta = new JTextField(15);

        JRadioButton rbNormal = new JRadioButton("Normal");
        JRadioButton rbPremium = new JRadioButton("Premium");
        ButtonGroup grupoCuenta = new ButtonGroup();
        grupoCuenta.add(rbNormal);
        grupoCuenta.add(rbPremium);

        JButton btnOk = new JButton("ok");
        JButton btnCancel = new JButton("Cancel");

       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;

        int y = 0;

        gbc.gridx = 0; gbc.gridy = y;
        add(lblNombre, gbc);
        gbc.gridx = 1;
        add(txtNombre, gbc); y++;

        gbc.gridx = 0; gbc.gridy = y;
        add(lblApellidos, gbc);
        gbc.gridx = 1;
        add(txtApellidos, gbc); y++;

        gbc.gridx = 0; gbc.gridy = y;
        add(lblUsername, gbc);
        gbc.gridx = 1;
        add(txtUsername, gbc); y++;

        gbc.gridx = 0; gbc.gridy = y;
        add(lblPassword, gbc);
        gbc.gridx = 1;
        add(txtPassword, gbc); y++;

        gbc.gridx = 0; gbc.gridy = y;
        add(lblEmail, gbc);
        gbc.gridx = 1;
        add(txtEmail, gbc); y++;

        gbc.gridx = 0; gbc.gridy = y;
        add(lblCuenta, gbc);
        gbc.gridx = 1;
        add(txtCuenta, gbc); y++;

        gbc.gridx = 0; gbc.gridy = y;
        add(rbNormal, gbc);
        gbc.gridx = 1;
        add(rbPremium, gbc); y++;

        gbc.gridx = 0; gbc.gridy = y;
        add(btnOk, gbc);
        gbc.gridx = 1;
        add(btnCancel, gbc);



    }

   
            
            
            
            }

