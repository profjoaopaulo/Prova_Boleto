import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //Entradas
        System.out.println("Digite a descrição do boleto: ");
        String descricao = scanner.nextLine();
        System.out.println("Digite o mês (1 a 12) de vencimento do boleto: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano de vencimento do boleto: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o valor (R$) do boleto: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite o valor (R$) do desconto (1 a 100%) para o boleto: ");
        double desconto = scanner.nextDouble();

        //Instanciando o objeto Boleto
        Boleto boleto = new Boleto(descricao, mes, ano, valor);
        System.out.println(boleto.informacoes());
        System.out.println("O valor a ser pago com desconto de " + desconto + "% é de R$ " + boleto.desconto(desconto));
        scanner.close();
    }
}
