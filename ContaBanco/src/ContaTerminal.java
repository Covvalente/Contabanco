import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String NomeCliente;
        double saldo;

        System.out.print("Por Favor digite o numero da agência : ");
        agencia = sc.nextLine();

        System.out.print("Por Favor digite o seu numero da sua conta : ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Por Favor digite o nome do cliente : ");
        NomeCliente = sc.nextLine();

        System.out.print("Por Favor digite o seu saldo : ");
        saldo = sc.nextDouble();

        System.out.println();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, Sua agência é %s, conta %d e seu saldo  %.2f já está disponível para saque.",
                NomeCliente, agencia, numero, saldo));

        sc.close();
    }
}
