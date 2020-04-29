package lab2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Arquivo2 {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        //Imprime a data formatada
        System.out.println("Hoje é "+dateFormat.format(date));

        int a = 500;
        int b = 1000;
        int c = 700; //Alterado aqui
        //teste git fetch
        System.out.println("a+b+c="+(a+b+c)); //Alterado aqui
 
    }
}
