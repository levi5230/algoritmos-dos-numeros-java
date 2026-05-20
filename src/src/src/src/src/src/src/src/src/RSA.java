public class RSA {

    public static void executar() {

        int p = 3;
        int q = 11;

        int n = p * q;

        int phi = (p - 1) * (q - 1);

        int e = 3;

        int d = 7;

        int mensagem = 5;

        int cifrada = (int) Math.pow(mensagem, e) % n;

        int decifrada = (int) Math.pow(cifrada, d) % n;

        System.out.println("Mensagem original: " + mensagem);
        System.out.println("Mensagem cifrada: " + cifrada);
        System.out.println("Mensagem decifrada: " + decifrada);

    }
}
