package ConversorMoedas;
import javax.swing.*;
import java.awt.*;



public class Main {
    

    public static void main(String[] args) {
        JFrame janela = new JFrame("Conversor de Moedas");
        
        janela.setSize(720,500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        
        String[] opcoes = {"BRL","USD","EUR","JPY"};


        JComboBox<String> select = new JComboBox<>(opcoes);

        select.addActionListener(e -> {
            String selecionado = (String) select.getSelectedItem();
            System.out.println(selecionado);
        });

        JPanel titulo = new JPanel();
        JPanel Inicial  = new JPanel();

        JLabel texto_tit = new JLabel("Conversor de Moedas");
        JLabel de = new JLabel("De: ");


        
        
        texto_tit.setFont(new Font("Arial",Font.BOLD,32));
        


    

        titulo.add(texto_tit);        
        Inicial.add(de);

        janela.add(titulo);
        janela.add(Inicial);
        janela.add(select);



        janela.setVisible(true);
    }
}
