import javax.swing.*;





class Main{

    public static void main(String[] args){
        JFrame janela = new JFrame("Calculadora");
        janela.setSize(1200,400);
        JPanel painel = new JPanel();

        JButton button = new JButton();
        
        painel.add(button);

        janela.add(painel);
        janela.setVisible(true);
    }

}    