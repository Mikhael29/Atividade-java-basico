import java.util.Scanner;

public class CalculojavaIPI {
    public static void main(String[] args) {
        double ipi, valorPeca1, valorPeca2;
        int codigoPecaUm, codigoPecaDois, quantidadePeca1, quantidadePeca2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a porcentagem do IPI: ");
        ipi = scanner.nextDouble();
        
        System.out.print("Digite o código da peça 1: ");
        codigoPecaUm = scanner.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        valorPeca1 = scanner.nextDouble();

        System.out.print("Digite a quantidade de peças 1: ");
        quantidadePeca1 = scanner.nextInt();

        System.out.print("Digite o código da peça 2: ");
        codigoPecaDois = scanner.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        valorPeca2 = scanner.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        quantidadePeca2 = scanner.nextInt();
        
        // Calculando o valor total a ser pago
        double valorTotal = (valorPeca1 * quantidadePeca1 + valorPeca2 * quantidadePeca2) * (ipi / 100 + 1);
        
        // Apresentando o resultado
        System.out.println("Valor total a ser pago: " + valorTotal);
        
        scanner.close();
    }
}
