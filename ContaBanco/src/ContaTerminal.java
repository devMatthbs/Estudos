import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao banco Java!");
        System.out.println("Por favor, informe seus dados para ter acesso ao nosso banco.");
        System.out.print("Nome completo: ");
        String primeiroNome = sc.next();
        String segundoNome = sc.next();
        String nomeCliente = nomeCompleto(primeiroNome, segundoNome);

        System.out.print("Agência: ");
        String agencia = sc.next();
        System.out.print("Conta: ");
        int numero = sc.nextInt();

        System.out.println("informe o valor do depósito que quer fazer na sua conta: ");
        double saldo = sc.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.print("sua agência é " + agencia + ", conta " + numero);
        System.out.printf(" e seu saldo R$%.2f", saldo, " já está disponível para saque%n");

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}