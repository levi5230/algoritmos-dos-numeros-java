import java.util.Scanner;

public class Euclides {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Segundo número: ");
        int b = entrada.nextInt();

        while (b != 0) {

            int resto = a % b;
            a = b;
            b = resto;

        }

        System.out.println("MDC = " + a);

    }
}
