package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        int quantidade = scanner.nextInt();

        scanner.close();

        double precoUnitario;

        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        double valorTotal = quantidade * precoUnitario;

        System.out.printf("Valor total a ser pago pelas maçãs: R$ %.2f%n", valorTotal);
    }
}
