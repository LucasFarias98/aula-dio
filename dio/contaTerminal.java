
import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo, por favor:");
        String nome = scanner.nextLine();

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Insira seu salário:");
        double salario = scanner.nextDouble();

        System.out.println("Detalhes da Conta:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);

        scanner.close();
    }
}
