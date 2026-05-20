import java.util.Scanner;

public class Fermat {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Base: ");
        int a = entrada.nextInt();

        System.out.print("Primo p: ");
        int p = entrada.nextInt();

        long resultado = 1;

        for (int i = 1; i < p; i++) {
            resultado = (resultado * a) % p;
        }

        System.out.println("Resultado = " + resultado);

    }
}
