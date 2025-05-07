import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random number_chosen = new Random();
		
		boolean running = true;
		
		System.out.println("Bem-vindo ao Jogo de Adivinhação");
		int numero = number_chosen.nextInt(100)+1;
		while(running){
		  System.out.println("Tente Adivinhar o número: ");
		  int escolha = input.nextInt();
		  
		  if(escolha == numero){
		      running = false;
		  }
		  else{
		      if(escolha > numero){
		          System.out.println("Menos");
		      }
		      else if (escolha < numero){
		          System.out.println("Mais");
		      }
		      
		  continue;
		  }
		    
		}
		System.out.println("Parabéns!!");
		input.close();
	}
}
