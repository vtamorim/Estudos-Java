
import java.util.Scanner;
import java.util.regex.*;
import java.awt.List;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;


public class Main{
    static ArrayList<String> Lista = new ArrayList<String>();
    static String validation = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";
    private String senha;
    static void Iniciar(){
        System.out.println("Bem-vindo ao Centro de Contatos");
        System.out.println("Por favor,Escolhe uma opção");
        System.out.println("C para se Cadastrar\nL para Iniciar Sessão");
        String Choose_cl = Entrada.Entry.nextLine();
        switch (Choose_cl) {
            case "C":
                Cadastrar();
                
                break;
            case "L":

                break;
            default:
                break;
        }


    }
    public void set_senha(String senha){
        this.senha = senha;
    }
    static void Cadastrar(){
        Main principal = new Main();
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
        System.out.print("Sua Senha: ");
        principal.set_senha(Entrada.Entry.nextLine());
        

    }



    static Integer Menu(){
        String[] opcoes = {"Adicionar Contato","Editar Contato","Pesquisar Contato","Listar os Contatos"};
        for (int index = 0; index < opcoes.length; index++) {
            System.out.println("[" + index + "]" + opcoes[index]);
        }

        return Entrada.Entry.nextInt();
    }


    static void Principal(){
        while (true) {
            Integer mano = Menu();
            switch (mano) {
                case 0:
                    
                    break;
            
                default:
                    break;
            }
        }
    }

    static void Adicionar(){
        System.out.print("Nome do Contato: ");
        String nome = Entrada.Entry.nextLine();
        System.out.print("Idade do(a) " + nome +": " );
        Integer idade = Entrada.Entry.nextInt();
        System.out.print("Número do(a) " + nome +": ex: (11) 91111-1111");
        String fone = Entrada.Entry.nextLine();
        Lista.add("Nome: " + nome + " Idade: " +  idade + " Fone: " + fone );
    }

    static void Listar(){
        if (Lista.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("Insira primeiro seu animal '-' ");
        }
        for (String string : Lista) {
            System.out.println(string);
        }
    }

    
    public static void main(String[] args){
        try{
            File savefile = new File("arquivo.txt");
            if (savefile.createNewFile()) {
                System.out.println("deu certo");
            }
            else{
                System.out.println("já tem");
            }
        }
        catch (IOException e){
            System.out.println("deu erro ai");
            e.printStackTrace();
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