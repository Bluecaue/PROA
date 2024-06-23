package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito mensal: ");
        double depositoMensal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxaJurosMensal = scanner.nextDouble();

        taxaJurosMensal /= 100.0;

        double montante = 0.0;

        for (int mes = 1; mes <= 12; mes++) {
            montante = (montante + depositoMensal) * (1 + taxaJurosMensal);
        }

        System.out.printf("\nMontante após 12 meses: R$ %.2f\n", montante);

        scanner.close();
    }
}
