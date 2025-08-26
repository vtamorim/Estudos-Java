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
        JComboBox<String> sele_final = new JComboBox<>(opcoes);
        select.addActionListener(e -> {
            String selecionado = (String) select.getSelectedItem();
            System.out.println(selecionado);
        });

        JPanel titulo = new JPanel(new GridLayout(2, 1));
        titulo.setPreferredSize(new Dimension(300, 50));
        titulo.setMaximumSize(new Dimension(300, 50));
        JPanel Inicial  = new JPanel(new GridLayout(2, 1));
        Inicial.setPreferredSize(new Dimension(300, 50));
        Inicial.setMaximumSize(new Dimension(300, 50));
        JPanel Conversao = new JPanel(new GridLayout(2, 1));
        Conversao.setPreferredSize(new Dimension(300, 50));
        Conversao.setMaximumSize(new Dimension(300, 50));


        JLabel texto_tit = new JLabel("Conversor de Moedas");
        JLabel de = new JLabel("De: ");
        de.setAlignmentX(Component.CENTER_ALIGNMENT);
        TextField valor_inicial = new TextField(15);
        
        TextField valor_final = new TextField(15);


        
        texto_tit.setFont(new Font("Arial",Font.BOLD,32));
        


        titulo.setBackground(new Color(0,0,0));
        Inicial.setBackground(new Color(0,0,0));
        Conversao.setBackground(new Color(0,0,0));
        





        Button submit = new Button("Enviar");
    
        
        titulo.add(texto_tit);        
        Inicial.add(de);
        Inicial.add(valor_inicial);
        Inicial.add(select);
        Conversao.add(sele_final);
        Conversao.add(valor_final);

        janela.add(titulo);
        janela.add(Inicial);
        janela.add(Conversao);
        janela.add(submit);

        

        janela.setVisible(true);
    }
}
