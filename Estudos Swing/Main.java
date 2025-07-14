import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Clique em mim!");

        JButton outro = new JButton("Outro Botão clicado");


        button.addActionListener( e -> {
            panel.add(outro);
            outro.addActionListener( w -> {
                panel.add(new JButton("outro butao"));
                panel.revalidate();
            });
            panel.revalidate();
        });
        panel.add(button);
        frame.add(panel);
        
        String outraentrada = entrada.nextLine();
        if (outraentrada.equals("S")) {
            frame.setVisible(true);
        }
    }
}