import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia + ", conta " + numero);
        System.out.println( "e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}