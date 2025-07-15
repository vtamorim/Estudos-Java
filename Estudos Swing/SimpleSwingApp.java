import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleSwingApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Primeira Janela");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Clique em mim!");

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}