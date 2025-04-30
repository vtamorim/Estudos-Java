import java.util.Scanner;

public class Main{
    static float result(int condition,float fn, float sn){
        switch(condition){
            case 0:
                return fn + sn;
            case 1:
                return fn - sn;
            case 2:
                return fn * sn;
            case 3:
                return fn / sn;
            default:
                System.out.println("Valor Inválido");
                return 0;
        }
        
    }
    public static void main (String[] args) {
    System.out.println("Bem-vindo à Calculadora");
    
    boolean running = true;
    while (running){
        Scanner input = new Scanner(System.in);
        System.out.println("Primeiro Número: ");
        float first_number = input.nextFloat();
        
        String [] name_ope = {"Adição","Subtração","Multiplicação","Divisão"};
    
        for(int i =0; i < name_ope.length ; i++){
            System.out.println("["+ i +"]" + " " + name_ope[i]);
        }
        int choose =  input.nextInt();
        
        System.out.println("Segundo Número: ");
        float second_number = input.nextFloat();
        
        System.out.println(result(choose, first_number, second_number));
        input.nextLine();
        System.out.println("Deseja Sair da Calculadora?");
        
        System.out.println("[S] para Sim");
        System.out.println("[N] para Não");
        
        String sair = input.nextLine();
        if(sair.equalsIgnoreCase("S")){
            running = false;
        input.close();
}
    }
    
    }
}