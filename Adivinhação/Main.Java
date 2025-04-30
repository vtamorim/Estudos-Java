import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Random numbers = new Random();
		Scanner input = new Scanner(System.in);
		int number_chosen = numbers.nextInt(100);
		
		
		boolean running = true;
        int choose = 0;
	    
	    System.out.println("Bem vindo ao Jogo de Adivinhação de Número!");
		System.out.println("Obs: o Número Escolhido está entre 0 e 100");
		while(running){
		   
		   choose = input.nextInt(100);
		   input.nextLine();
		   if(choose > number_chosen){
		       System.out.println("Less");
		   }
		   else if(choose < number_chosen){
		       System.out.println("More");
		   }
		   else{
		        System.out.println("Right!");
		        running = false;
		   }	   
		    
	}}
}
