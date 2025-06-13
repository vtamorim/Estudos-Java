import java.util.Scanner;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Pass {
    static String list_charac = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890;!@#$%¨&*()-=+^`^][";
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Random aleatorio = new Random();
        ArrayList<String> senha = new ArrayList<String>();

       
        System.out.print("Tamanho de sua senha: ");
        int range = entry.nextInt();
        
        for (int i = 0; i <= range; i++) {
            
        }
        entry.close();
    }
}
