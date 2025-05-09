import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main
{
	public static void main(String[] args) {
		Map <String, String> dicionary =  new HashMap<>();
		
		Scanner input = new Scanner(System.in);
		
		
		String name = input.nextLine();
		dicionary.put(name,"16");
		dicionary.put("Cleberson","95");
		dicionary.put("Djonga","173");
		
		
		//Por enquanto, esse arquivo apenas servirá como teste para um projeto breve
		System.out.println(dicionary.get(name));
		
		
		input.close();
	}
}
