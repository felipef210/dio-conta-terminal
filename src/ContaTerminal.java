import java.util.Scanner;

public class ContaTerminal {
    public void iniciar() throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        
        // Consumir a quebra de linha pendente
        scanner.nextLine();
        
        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite o seu saldo: ");
        String saldoStr = scanner.next();
        double saldo = Double.parseDouble(saldoStr);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.") ;
        
        scanner.close();
    }
}