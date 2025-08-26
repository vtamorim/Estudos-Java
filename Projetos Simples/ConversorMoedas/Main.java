package ConversorMoedas;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Conversor de Moedas");
        janela.setSize(720, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajustar o painel
        JPanel Agrupamento = new JPanel();
        Agrupamento.setLayout(new BoxLayout(Agrupamento, BoxLayout.Y_AXIS));
        Agrupamento.setBackground(Color.BLACK);

        // Lista de moedas (Por enquanto as opçoes está aqui, mas vou tentar conectar com API dps )
        String[] opcoes = {"BRL", "USD", "EUR", "JPY"};
        JComboBox<String> select = new JComboBox<>(opcoes);
        JComboBox<String> sele_final = new JComboBox<>(opcoes);

        select.addActionListener(e -> {
            String selecionado = (String) select.getSelectedItem();
            System.out.println(selecionado);
        });

        // Ajuste e Declaração do Painel Título 
        JPanel titulo = new JPanel(new GridLayout(1, 1));
        titulo.setBackground(Color.BLACK);
        titulo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 80));
        JLabel texto_tit = new JLabel("Conversor de Moedas");
        texto_tit.setFont(new Font("Arial", Font.BOLD, 32));
        texto_tit.setForeground(Color.WHITE);
        titulo.add(texto_tit);

        // Painel Inicial (Primeira entrada do usuário)
        JPanel Inicial = new JPanel(new GridLayout(3, 1, 5, 5));
        Inicial.setBackground(Color.BLACK);
        Inicial.setMaximumSize(new Dimension(Integer.MAX_VALUE, 120));
        JLabel de = new JLabel("De: ");
        de.setForeground(Color.WHITE);
        TextField valor_inicial = new TextField(15);
        Inicial.add(de);
        Inicial.add(select);
        Inicial.add(valor_inicial);

        // Painel Conversão (Segunda Entrada do usuário)
        JPanel Conversao = new JPanel(new GridLayout(3, 1, 5, 5));
        Conversao.setBackground(Color.BLACK);
        Conversao.setMaximumSize(new Dimension(Integer.MAX_VALUE, 120));
        JLabel para = new JLabel("Para: ");
        para.setForeground(Color.WHITE);
        TextField valor_final = new TextField(15);
        Conversao.add(para);
        Conversao.add(sele_final);
        Conversao.add(valor_final);

        // Enviar (válido como submit)
        JButton submit = new JButton("Enviar");
        submit.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adicionando painéis e espaçamentos
        Agrupamento.add(titulo);
        Agrupamento.add(Box.createRigidArea(new Dimension(0, 10)));
        Agrupamento.add(Inicial);
        Agrupamento.add(Box.createRigidArea(new Dimension(0, 10)));
        Agrupamento.add(Conversao);
        Agrupamento.add(Box.createRigidArea(new Dimension(0, 10)));
        Agrupamento.add(submit);

        // Adicionando ao JFrame
        janela.setLayout(new BorderLayout());
        janela.add(Agrupamento, BorderLayout.CENTER);

        janela.setVisible(true);
    }
}
