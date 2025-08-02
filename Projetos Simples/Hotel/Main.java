package Hotel;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


class Main{
    static Scanner Entrada = new Scanner(System.in); 
    static Date data = new Date();
    static List<String> listinha = new ArrayList<>();
    public static void main(String[] args){
        File myObj = new File("Hotel/disponiveis.json");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }

    }
}