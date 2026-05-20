import java.util.Scanner;

public class Primos {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        }

        for (int i = 2; i < numero; i++) {

            if (numero % i == 0) {
                primo = false;
                break;
            }

        }

        if (primo) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }

    }
}
