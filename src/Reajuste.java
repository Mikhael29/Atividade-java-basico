import java.util.Scanner;

public class Reajuste {

    public static void main(String[] args) {
        double saldo, saldoReajustado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        saldo = sc.nextDouble();

        // Calcula o saldo com reajuste de 1%
        saldoReajustado = saldo * 1.01;

        // Exibe o saldo com reajuste
        System.out.println("Saldo com reajuste de 1%: " + saldoReajustado);

        sc.close();
    }
}
