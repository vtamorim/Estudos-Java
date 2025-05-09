import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    static void ad_evento(){
        Map <String, String> dicionary =  new HashMap<>();
		Scanner input = new Scanner(System.in);
		
        System.out.println("Nome do Evento:");
        String name_event = input.nextLine();
        
        System.out.println("Data do Evento: (ex: 25/10/2025)");
        String data_event = input.nextLine();

        dicionary.put(name_event, data_event);
        
        
        System.out.println(name_event + "; Dia:" +dicionary.get(name_event));
    }
    
    
    
	public static void main(String[] args) {
		Map <String, String> dicionary =  new HashMap<>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Opa, aqui é uma Agenda \nO que desejas?");
		String[] lista_do = {"Adicionar Evento","Editar Evento","Próximo Evento","Compromissos do Dia"};
		for (int i=0;i < lista_do.length ; i++ ) {
		    System.out.println("[" + i + "]" + lista_do[i]);
		}
		
	    int escolha = input.nextInt();
	    switch(escolha){
	       case 0:
	           ad_evento();
	       case 1:
	           break;
	       case 2:
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
		input.close();
	}
}
