import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		Scanner emailentry = new Scanner(System.in);
		
		String validation = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
		
		
		System.out.println("Por favor, Insira seu email:");
		String email = emailentry.nextLine();
		
		Pattern pattern = Pattern.compile(validation);
		
		Matcher matcher = pattern.matcher(email);
		emailentry.close();
		if(matcher.find()){
		    System.out.println("Email Válido!");
		}
		else{
			
		    throw new IllegalArgumentException("Email inválido.");
		}
		
	}
}
