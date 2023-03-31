import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    //check vogal
    public static void main(String[] args) {

        //var vogals = new ArrayList<String>();
        //vogals.add("a");vogals.add("e");vogals.add("i");vogals.add("o");vogals.add("u");
        //System.out.println(vogals.contains("b"));

        String str = "Education best team";
        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
        var vogals = new ArrayList<String>();
        vogals.add("a"); vogals.add("e"); vogals.add("i"); vogals.add("o"); vogals.add("u");

        for (String item : strSplit) {
            item = item.toLowerCase();
            for (int i = 0; i < item.length(); i++) {
                if(vogals.contains(item.charAt(i)+"")) {
                    quantVogais++;
                }
            }

            if(item.equals(" ")) { espacosEmBranco++; }

        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
