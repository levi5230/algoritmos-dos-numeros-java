import java.util.Scanner;

public class Congruencia {

    public static void executar() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = entrada.nextInt();

        System.out.print("Módulo: ");
        int modulo = entrada.nextInt();

        int resultado = numero % modulo;

        System.out.println("Resultado = " + resultado);

    }
}
