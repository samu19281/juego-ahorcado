        /*
         * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
         * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
         */
        package el.ahorcado.Principal;
        import javax.swing.*;
        import java.awt.*;

        /**
         *
         * @author samgomgom
         */
        public class AbrirJuego extends JFrame {

            public AbrirJuego(){

                setTitle("Ahorcado");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setSize(800, 600);
                setLayout(new BorderLayout());


                JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                JButton btnNuevaPartida = new JButton("Nueva Partida");
                JButton btnSalir = new JButton("Salir");
                JLabel turnoLabel = new JLabel("Turno de: Jugador 1");


                topPanel.add(btnNuevaPartida);
                topPanel.add(btnSalir);
                topPanel.add(turnoLabel);


                JPanel leftPanel = new JPanel();
                leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
                leftPanel.setPreferredSize(new Dimension(180, 600));

                JLabel letrasUsadas = new JLabel("letras Usadas:");
                JLabel puntuacion = new JLabel("Puntuacion:");
                letrasUsadas.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                puntuacion.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

                leftPanel.add(letrasUsadas);
                leftPanel.add(Box.createRigidArea(new Dimension(0, 20)));
                leftPanel.add(puntuacion);


                JPanel centerPanel = new JPanel();
                centerPanel.setLayout(new BorderLayout());


                JPanel bottomPanel = new JPanel(new GridLayout(3, 9, 5, 5));
                for (char c = 'A'; c <= 'Z'; c++) {
                    JButton letraBtn = new JButton(String.valueOf(c));
                    bottomPanel.add(letraBtn);
                }


                add(topPanel, BorderLayout.NORTH);
                add(leftPanel, BorderLayout.WEST);
                add(centerPanel, BorderLayout.CENTER);
                add(bottomPanel, BorderLayout.SOUTH);

                setVisible(true);
            }


        }


