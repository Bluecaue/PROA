package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();

        double saldoReajustado = saldo * 1.015;

        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("Saldo com reajuste de 1.5%: R$ " + saldoReajustado);

        scanner.close();
    }
}
