import javax.swing.*;
import java.awt.*;




class Main{

    public static void main(String[] args){
        JFrame janela = new JFrame("IMC");
        janela.setSize(720,600);

        JPanel principal = new JPanel();
        principal.setLayout(new BoxLayout(principal, BoxLayout.Y_AXIS));

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS)); // vertical
        JLabel texto = new JLabel("Calculadora IMC");
        JLabel texto_resultado = new JLabel("");
        texto.setFont(new Font("Arial",Font.BOLD,32));
        texto.setForeground(Color.white);
        texto_resultado.setForeground(Color.white);
        texto_resultado.setFont(new Font("Arial", Font.BOLD, 18));
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);
        texto_resultado.setAlignmentX(Component.CENTER_ALIGNMENT);
        painel.add(texto);
        painel.add(Box.createRigidArea(new Dimension(0, 8))); // espaço entre título e resultado
        painel.add(texto_resultado);


        JPanel idade = new JPanel(new GridLayout(2, 1));
        idade.setPreferredSize(new Dimension(300, 50));
        idade.setMaximumSize(new Dimension(300, 50));

        JLabel texto_idade = new JLabel("Sua Idade:");
        JTextField textField = new JTextField(15);

        idade.add(texto_idade);
        idade.add(textField);



        JPanel peso = new JPanel(new GridLayout(2, 1));
        peso.setPreferredSize(new Dimension(300, 50));
        peso.setMaximumSize(new Dimension(300, 50));
        JLabel texto_peso = new JLabel("Seu Peso (Em Kg): ");
        JTextField textPeso = new JTextField(15);
        peso.add(texto_peso);
        peso.add(textPeso);

        JPanel altura = new JPanel(new GridLayout(2, 1));
        altura.setPreferredSize(new Dimension(300, 50));
        altura.setMaximumSize(new Dimension(300, 50));
        JLabel texto_altura = new JLabel("Sua Altura (Em Metros): ");
        JTextField textaltura = new JTextField(15);
        altura.add(texto_altura);
        altura.add(textaltura);

        

        Color cor_padrao = new Color(84, 174, 185);
        painel.setBackground(cor_padrao);
        JButton enviar = new JButton("Enviar");


        enviar.addActionListener(e ->{
            try{
                
                int valor_idade = Integer.parseInt(textField.getText());
                float valor_peso = Float.parseFloat(textPeso.getText());
                float valor_altura = Float.parseFloat(textaltura.getText());
                float imc = valor_peso/( valor_altura*valor_altura);
                String resultado;
                if (imc < 18.5) {
                    resultado = "Abaixo do peso";
                    principal.setBackground(new Color(86, 76, 228));
                    painel.setBackground(new Color(86, 76, 228));
                } else if (imc < 24.9) {
                    resultado = "Peso Adequado";
                    principal.setBackground(new Color(84, 174, 185));
                    painel.setBackground(new Color(84, 174, 185));
                } else if (imc < 29.9) {
                    resultado = "Sobrepeso";
                    principal.setBackground(new Color(255, 193, 7));
                    painel.setBackground(new Color(255, 193, 7));
                } else if (imc < 34.9) {
                    resultado = "Obesidade grau I";
                    principal.setBackground(new Color(255, 87, 34));
                    painel.setBackground(new Color(255, 87, 34));
                } else if (imc < 39.9) {
                    resultado = "Obesidade grau II";
                    principal.setBackground(new Color(244, 67, 54));
                    painel.setBackground(new Color(244, 67, 54));
                } else {
                    resultado = "Obesidade grau III(grave)";
                    principal.setBackground(new Color(156, 39, 176));
                    painel.setBackground(new Color(156, 39, 176));
                
                }
            texto_resultado.setText(resultado);
            }
            catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(janela, "Digite apenas números válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
    }
        });
        idade.setBackground(new Color(100,200,150));
        peso.setBackground(new Color(100,200,150));
        altura.setBackground(new Color(100,200,150));
        principal.setBackground(new Color(84, 174, 185));

        


        painel.add(texto_resultado);
        principal.add(Box.createVerticalGlue());
        

        principal.add(painel);
        principal.add(Box.createRigidArea(new Dimension(0, 10)));

        principal.add(idade);
        principal.add(Box.createRigidArea(new Dimension(0, 10))); 

        principal.add(peso);
        principal.add(Box.createRigidArea(new Dimension(0, 10))); 

        principal.add(altura);
        principal.add(Box.createRigidArea(new Dimension(0, 10))); 


        enviar.setAlignmentX(Component.CENTER_ALIGNMENT);
        principal.add(enviar);
        
        principal.add(Box.createVerticalGlue());
        janela.add(principal);
        janela.setVisible(true);
    }

}