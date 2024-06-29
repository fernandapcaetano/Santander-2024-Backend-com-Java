import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo = scanner.nextDouble();

        ContaTerminal conta1 = new ContaTerminal(numero, agencia, nome, saldo);
        System.out.print(conta1.toString());

        scanner.close();
    }
}
