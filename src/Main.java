import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (b < numero) {
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        if (b == numero) {
            return true;
        } else {
            return false;
        }
    }
}
