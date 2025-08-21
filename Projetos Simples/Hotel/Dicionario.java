package Hotel;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dicionario {
    public static void main(String[] args) {
        Map<String, String> dicionario = new HashMap<>();
        Scanner entrada = new Scanner(System.in);


        for (int i = 100; i < 400; i++) {
            String quarto = Integer.toString(i);
            if (Integer.parseInt(quarto.substring(1, 3)) < 11) {
                dicionario.put("Quarto " + quarto, "Disponível");
            }
        }


        while (true) {
            System.out.println("\n--- Reserva de Hotel ---");
            for (String chave : dicionario.keySet()) {
                System.out.println(chave + " -> " + dicionario.get(chave));
            }

            System.out.println("\nDigite o quarto que deseja reservar (ex: Quarto 101) ou 'sair':");
            String escolha = entrada.nextLine();

            if (escolha.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            if (dicionario.containsKey(escolha)) {
                if (dicionario.get(escolha).equals("Disponível")) {
                    dicionario.put(escolha, "Reservado");
                    System.out.println("✅ Reserva feita com sucesso para " + escolha);
                } else {
                    System.out.println("⚠ Esse quarto já está reservado!");
                    continue;
                }
            } else {
                System.out.println("❌ Quarto inválido!");
                break;
            }
        }

        entrada.close();
    }
}
