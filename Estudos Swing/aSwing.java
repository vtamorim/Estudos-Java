
/* 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Scanner;

public class aSwing {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Clique em mim!");

        JButton outro = new JButton("Outro Botão clicado");

        JLabel label = new JLabel("Digite algo");
        JTextField sla = new JTextField(15);
        button.addActionListener( e -> {
            String texto = sla.getText();
            JOptionPane.showMessageDialog(frame,"Você digitou: " + texto);

        });
        frame.add(label);
        panel.add(button);
        frame.add(panel);   
        frame.add(sla);
        String outraentrada = entrada.nextLine();
        if (outraentrada.equals("S")) {
            frame.setVisible(true);
        }



        entrada.close();
    }
}
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Swing");
        frame.setSize(1300, 950);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Digite algo:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Mostrar");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto = textField.getText();
                JOptionPane.showMessageDialog(frame, "Você digitou: " + texto);
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }
}
