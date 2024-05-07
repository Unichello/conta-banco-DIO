import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int agencia = 2680;
        double saldo = 0.00;
        int conta = 12345;

        System.out.println("Digite seu nome e sobrenome: ");
        Scanner scanner = new Scanner(System.in);
        String nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

    }
}