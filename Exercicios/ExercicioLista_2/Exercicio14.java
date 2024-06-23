package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        scanner.close();

        int totalDias = calcularDiasDeVida(anos, meses, dias);

        System.out.println("Você tem aproximadamente " + totalDias + " dias de vida.");
    }

    public static int calcularDiasDeVida(int anos, int meses, int dias) {
        int diasDeVida = anos * 365 + meses * 30 + dias;
        return diasDeVida;
    }
}
