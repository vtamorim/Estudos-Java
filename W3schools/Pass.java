import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Random;

public class Pass {
    public static void main(String[] args) {
        String list_charac = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890;!@#$%¨&*()-=+^`^][";
        Scanner entry = new Scanner(System.in);
        Random aleatorio = new Random();
        ArrayList<String> senha = new ArrayList<String>();

       
        System.out.print("Tamanho de sua senha: ");
        int range = entry.nextInt();
        
        String[] listinha = list_charac.split("(?!^)");
        for (int i = 0; i <= range; i++) {
            int valor = aleatorio.nextInt(list_charac.length())+1;
            senha.add(listinha[valor]);
        }

        String juntador = String.join("", senha);
        
        System.out.println("Sua Senha: " + juntador);

        entry.close();
    }
}
