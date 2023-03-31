
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Dio {

    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0.00; double diferenca = 0.00;

        if (renda > 4500) {
            imposto = 1000 * 0.08 + 1500 * 0.18;
            diferenca = renda - 4500;
            imposto += diferenca * 0.28;
        } else if (renda > 3000) {
            imposto = 1000 * 0.08;
            diferenca = renda - 3000;
            imposto += diferenca * 0.18;
        } else if (renda > 2000) {
            diferenca = renda - 2000;
            imposto = diferenca * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.println("R$ " + decfor.format(imposto));
        }
    }
}



