package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cota��o do d�lar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de d�lares a ser convertida: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor de $" + quantidadeDolares + " d�lares � equivalente a R$" + valorEmReais + " reais.");

        scanner.close();
    }
}
