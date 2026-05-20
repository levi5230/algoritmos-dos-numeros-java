import java.util.Scanner;

public class MDC {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Segundo número: ");
        int b = entrada.nextInt();

        int mdc = 1;

        for (int i = 1; i <= a && i <= b; i++) {

            if (a % i == 0 && b % i == 0) {
                mdc = i;
            }

        }

        System.out.println("MDC = " + mdc);

    }
}
