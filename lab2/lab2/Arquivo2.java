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

        int a = 500; //Alterado aqui
        int b = 1000; //Alterado aqui
        // adicionado esse comentário para testar o git fetch.
        //não deu certo. depois que fiz o git --dif origin/teste ou master , deu certo.
        // testando git rebase
        // testes realizados. git rebase/ git fetch/ git pull/ git push.
        System.out.println("a+b="+(a+b));
     }
}
