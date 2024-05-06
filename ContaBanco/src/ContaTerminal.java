import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe scanner 
        //Exibir as mensagens para nosso usuario
        //Obter pela nossa classe scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada 

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor, Digite o numero da conta! ");
        int numero = scanner.nextInt();
        
        System.out.println("Por Favor, Digite o numero da Agencia! ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome! ");
        String nomeCliente = "";
        nomeCliente+= scanner.next();
        nomeCliente += scanner.nextLine();

        System.out.println("Quanto voce possui na conta? ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o seu saldo é " + saldo);

        System.out.println("Olá " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");


    }
}
