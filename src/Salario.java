import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        int salarioUsuario;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        salarioUsuario = sc.nextInt();
        double salarioMinimo = 1320;
        double quantidadeSM = salarioUsuario / salarioMinimo;
        String resultadoFormatado = String.format("%.2f", quantidadeSM);


        System.out.println("a quantidade de salários é igual: " + resultadoFormatado);

        sc.close();
    }
}