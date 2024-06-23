package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço unitário do produto: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotalSemDesconto = precoUnitario * quantidade;

        double valorTotalComDesconto = valorTotalSemDesconto;
        if (quantidade > 10) {
            valorTotalComDesconto *= 0.9; 
        }

        System.out.println("Valor total a ser pago: R$" + valorTotalComDesconto);

        scanner.close();
    }

}
