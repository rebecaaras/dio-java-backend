import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();
        
        scanner.close();

        System.out.println(String.format("Olá, %s obrigado por criar uma conta em nosso banco,"+
        "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo));
        
    
    }
    
}
