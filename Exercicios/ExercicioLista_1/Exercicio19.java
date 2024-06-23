package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar (em reais): ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares a ser convertida: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorEmReais = quantidadeDolares * cotacaoDolar;

        System.out.println("O valor de $" + quantidadeDolares + " dólares é equivalente a R$" + valorEmReais + " reais.");

        scanner.close();
    }
}
