import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
import java.time.LocalDate;


public class Main
{
    static Map <String, String> dicionary =  new HashMap<>();
	static Scanner input = new Scanner(System.in);
	static Set<String> keys = dicionary.keySet();
	static LocalDate data_atual = LocalDate.now();
	static int dia;
	static int mes;
	static int ano;


    static void ad_evento() {
        System.out.println("Qual Evento você quer adicionar?");
        
        System.out.println("Nome do Evento:");
        String name_event = input.nextLine();

        System.out.println("Data do Evento: (ex: 25/10/2025)");
        String data_event = input.nextLine();

        String[] dataParts = data_event.split("/");
        dia = Integer.parseInt(dataParts[0]);
        mes = Integer.parseInt(dataParts[1]);
        ano = Integer.parseInt(dataParts[2]);

        // Converte a data para uma string formatada
        String dataFormatada = String.format("%02d/%02d/%04d", dia, mes, ano);

        // Adiciona o evento ao mapa estático
        dicionary.put(name_event, dataFormatada);

        System.out.println(name_event + "; Data: " + dicionary.get(name_event));
    }

    static void ed_evento(){
        System.out.println("Qual Evento você queria Mudar?");
        System.out.println(dicionary.keySet());
    }
    
    static void prox_evento(){
    int dia_prox = data_atual.getMonthValue();
    int mes_prox = data_atual.getDayOfMonth();
    int ano_prox = data_atual.getYear();
    System.out.println("Data atual: " + data_atual);

    // Verifica se o evento foi adicionado
    if (dia != 0 && mes != 0 && ano != 0) {
        System.out.println("Próximo evento: " + String.format("%02d/%02d/%04d", dia, mes, ano));
    } else {
        System.out.println("Nenhum evento foi adicionado ainda.");
    }
		System.out.println(dia_prox + "" + dia);
    }
    
	public static void main(String[] args) {
		
		System.out.println("Opa, aqui é uma Agenda \nO que desejas?");
		boolean condition = true;
		while(condition){
		String[] lista_do = {"Adicionar Evento","Editar Evento","Próximo Evento","Compromissos do Dia"};
		for (int i=0;i < lista_do.length ; i++ ) {
		    System.out.println("[" + i + "]" + lista_do[i]);
		}
		
	    int escolha = input.nextInt();
	    input.nextLine();
	    switch(escolha){
	       case 0:
	            ad_evento();
	            break;
	       case 1:
	            ed_evento();
	            break;
	       case 2:
				prox_evento();
	            break;
	       case 3:
	           break;
	       default:
	           System.out.println("Número inválido");
	    }
		/*
		
		System.out.println("Nome que Deseja Cadastrar:");
		String name = input.nextLine();
		System.out.println("Aniversário da Pessoa \n (ex: 00/00/0000 : \n Dia/Mês/Ano");
		dicionary.put("Djonga","173");
		
		
		//Por enquanto, esse arquivo apenas servirá como teste para um projeto breve
		*/
		
		}
		input.close();
	}
}