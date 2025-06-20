import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class ToDO{
    private HashMap<String,String> tasks;
    private HashSet<String> tasksright;
    public Scanner entry = new Scanner(System.in);

    public void menu(){
        String[] opcoes = {"Inserir um Afazer","Editar Afazere(s)","Marcar como Concluída","Excluir Afazer","Listar os Afazeres"};
        for (int index = 0; index < opcoes.length; index++) {
            System.out.println(opcoes[index]);
        }
        String choose = entry.nextLine();
        
    }




}

class ToDoUI{
    

}



public class MainT {
    public static void main(String[] args) {
        ToDO mano = new ToDO();

        mano.menu();


    }
}
