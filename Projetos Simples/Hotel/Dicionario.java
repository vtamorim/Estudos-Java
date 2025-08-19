package Hotel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Dicionario {
    public static void main(String[] args) {
        Map<String, String> dicionario = new HashMap<>();
        Scanner Entrada = new Scanner(System.in);


        for (int i = 100; i < 400; i++) {
            String quarto = Integer.toString(i);
            if (Integer.parseInt(quarto.substring(1,3))< 11) {
                dicionario.put("Quarto " + quarto, "Disponível");
            }
        }




        

        
        while (true) {
            System.out.println("Reserva de Hotel '-' ");
            for (String chave : dicionario.keySet()) {
            System.out.println(chave + " -> " + dicionario.get(chave));
        }   
        String Escolha = Entrada.nextLine();
        for (String verificador : dicionario.keySet()) {
            if (verificador == Escolha) {
                System.out.println("Deu certo");
            }
        } 
        Entrada.close();
    }

       
    }

}
