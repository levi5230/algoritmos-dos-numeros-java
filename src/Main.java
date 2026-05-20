import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== ALGORITMOS DOS NÚMEROS =====");
            System.out.println("1 - MDC");
            System.out.println("2 - Euclides");
            System.out.println("3 - Número Primo");
            System.out.println("4 - Fatorização");
            System.out.println("5 - Congruência");
            System.out.println("6 - Fermat");
            System.out.println("7 - Euler");
            System.out.println("8 - RSA");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    MDC.executar();
                    break;

                case 2:
                    Euclides.executar();
                    break;

                case 3:
                    Primos.executar();
                    break;

                case 4:
                    Fatorizacao.executar();
                    break;

                case 5:
                    Congruencia.executar();
                    break;

                case 6:
                    Fermat.executar();
                    break;

                case 7:
                    Euler.executar();
                    break;

                case 8:
                    RSA.executar();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

    }
}
