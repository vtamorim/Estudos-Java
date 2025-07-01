
import java.util.Scanner;
import java.util.regex.*;





public class Main{

    public void Inicio(){
        System.out.println("Bem-vindo ao Centro de Contatos");
        System.out.println("Por favor,Escolhe uma opção");
        System.out.println("C para se Cadastrar\nL para Iniciar Sessão");
    }

    public static void main(String[] args){
    Main principal = new Main();
    principal.Inicio();


    }
}


class Entrada{
    public static final Scanner Entry = new Scanner(System.in);
}

