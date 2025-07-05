
import java.util.Scanner;
import java.util.regex.*;
import java.io.IOException;
import java.io.FileWriter;



public class Main{

    public void Inicio(){
        System.out.println("Bem-vindo ao Centro de Contatos");
        System.out.println("Por favor,Escolhe uma opção");
        System.out.println("C para se Cadastrar\nL para Iniciar Sessão");
    }

    public void Adicionar(){
        

    }


    
    public static void main(String[] args){

    String validation = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";

    Main principal = new Main();
    principal.Inicio();
    String veri = Entrada.Entry.nextLine();
    
    if(veri.equals("C")){
        System.out.print("Seu Email: ");
        String email = Entrada.Entry.nextLine();
        
        Pattern paterno = Pattern.compile(validation);

        Matcher macheri = paterno.matcher(email);

        if(macheri.find()){
            System.out.println("Válido");
        }
        else{
            throw new IllegalArgumentException("Email Inválido");
        }


    }
    else if(veri.equals("L")){

    }
    else
    {
        throw new IllegalArgumentException(veri);
    }
        
    }
    
}


class Entrada{
    public static final Scanner Entry = new Scanner(System.in);
}


class Contatos{
    private String nome;
    private String email;
    private Integer Idade;
    private String fone;



    public String get_nome(){
        return nome;
    }

    public String get_email(){
        return email;
    }
    
    public Integer get_idade(){
        return Idade;
    }
    public String get_fone(){
        return fone;
    }

    
    public void Set_nome(String novonome){
        this.nome = novonome;
    }

    public void Set_email(String novoemail){
        this.email = novoemail;
    }
    public void Set_idade(Integer novaidade){
        this.Idade = novaidade;
    }
    public void Set_fone(String novofone){
        this.fone = novofone;
    }
}