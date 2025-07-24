import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Map;
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
        switch (choose) {
            case "0":
                inserir();
                break;
            case "1":


            default:
                break;
        }
    }   
    public void inserir(){
        System.out.print("Nome do Afazer: ");
        String namedo = entry.nextLine();
        System.out.print("Status: ");
        String status = entry.nextLine();
        tasks.put(namedo,status);
    }
    public void listar(){
        if (tasks.size() == 0) {
            System.out.println("Nenhum Afazer :( )");
        }
        else{
            for (Map.Entry<String, String> entry : tasks.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}
        }
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
