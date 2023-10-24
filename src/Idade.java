import java.util.Scanner;

public class Idade{
    public static void main(String[] args) {
        int idadeEmDias;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número de anos: ");
        int anos = sc.nextInt();
        
        System.out.print("Digite o número de meses: ");
        int meses = sc.nextInt();
        
        System.out.print("Digite o número de dias: ");
        int dias = sc.nextInt();

        // calcula a idade em dias
        idadeEmDias = (anos * 365) + (meses * 30) + dias;

        // exibe a idade em dias
        System.out.println("Idade em dias: " + idadeEmDias + " dias.");

        sc.close();
    }
}
