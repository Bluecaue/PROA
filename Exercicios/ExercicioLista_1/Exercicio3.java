package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu saldo m�dio: ");
        int saldoMedio = scanner.nextInt();

        if (saldoMedio < 501) {
            System.out.println("Sem cr�dito");
        } else if (saldoMedio > 500 && saldoMedio < 1001) {
            System.out.println("30% de cr�dito");
        } else if (saldoMedio > 1000 && saldoMedio < 3001) {
            System.out.println("40% de cr�dito");
        } else if (saldoMedio > 3000) {
            System.out.println("50% de cr�dito");
        } else {
            System.out.println("N�mero inv�lido");
        }

        scanner.close();
    }
}
