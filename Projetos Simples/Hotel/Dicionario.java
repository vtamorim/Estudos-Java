package Hotel;
import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public static void main(String[] args) {
        Map<String, String> dicionario = new HashMap<>();



        for (int i = 100; i < 400; i++) {
            String quarto = Integer.toString(i);
            if (Integer.parseInt(quarto.substring(1,3))< 11) {
                dicionario.put("Quarto " + quarto, "Disponível");
            }
        }




        // Percorrer o dicionário
        for (String chave : dicionario.keySet()) {
            System.out.println(chave + " -> " + dicionario.get(chave));
        }
    }
}
