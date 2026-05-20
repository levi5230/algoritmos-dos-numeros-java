import java.util.Scanner;

public class Fatorizacao {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        System.out.print("Fatores primos: ");

        for (int i = 2; i <= numero; i++) {

            while (numero % i == 0) {

                System.out.print(i + " ");
                numero = numero / i;

            }

        }

        System.out.println();

    }
}
