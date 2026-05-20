import java.util.Scanner;

public class Euler {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = entrada.nextInt();

        int contador = 0;

        for (int i = 1; i < n; i++) {

            if (mdc(i, n) == 1) {
                contador++;
            }

        }

        System.out.println("Totiente = " + contador);

    }

    public static int mdc(int a, int b) {

        while (b != 0) {

            int resto = a % b;
            a = b;
            b = resto;

        }

        return a;

    }
}
