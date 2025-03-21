import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);   

        //solicitando e armazenando os dados do usuario
        System.out.println("Por gentileza, digite o número da Agência");
        String agencia = scanner.nextLine();

        System.out.println("Por gentileza, digite o número da conta");
        int numero = scanner.nextInt();
        scanner.nextLine(); //consumir a quebra de linha

        System.out.println("Por gentileza, digite o nome do Cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por gentileza, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        //Exibindo a mensagem formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        //fechando o scanner
        scanner.close();
    }
}
