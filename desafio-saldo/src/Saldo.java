
import java.util.Scanner;

public class Saldo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Digite o valor da primeira transação: ");
        double transacao1 = scanner.nextDouble();

        System.out.println("Digite o valor da segunda transação: ");
        double transacao2 = scanner.nextDouble();

        System.out.println("DIgite o valor da terceira transação");
        double transacao3 = scanner.nextDouble();

        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        System.out.println("Saldo final é igual a:%2.f\n " + saldoFinal);

        scanner.close();
    }
}
