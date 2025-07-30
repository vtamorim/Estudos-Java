package Hotel;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class Main{
    static Scanner Entrada = new Scanner(System.in); 
    static Date data = new Date();
    static List<String> listinha = new ArrayList<>();
    public static void main(String[] args){
        for (int i = 100; i < 400; i++) {
            String quarto = Integer.toString(i);
            if (Integer.parseInt(quarto.substring(1,3))< 11) {
                listinha.add(quarto);
            }
        }

            try(FileWriter Quartos_disp = new FileWriter("Hotel/disponiveis.json");){
                Quartos_disp.write("[\n");
                for (int i = 0; i < listinha.size(); i++) {
                    String e = listinha.get(i);
                    Quartos_disp.write("{\"Quarto\"" + ":\"" + e + "\"}");
                     if (i < listinha.size() - 1) {
                    Quartos_disp.write(",\n");
            }
                }
                Quartos_disp.write("\n]");
                Quartos_disp.close();
            }
            catch(IOException que){
                System.out.println("deu ruim");
                que.printStackTrace();
            }

        

    }
}