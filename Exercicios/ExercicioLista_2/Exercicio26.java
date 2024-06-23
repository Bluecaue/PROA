package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precoProduto1 = 10.0; 
        double precoProduto2 = 20.0; 
        double precoProduto3 = 30.0; 

        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        scanner.close();

        double valorTotal;

        switch (codigoProduto) {
            case 1:
                valorTotal = precoProduto1 * quantidadeComprada;
                break;
            case 2:
                valorTotal = precoProduto2 * quantidadeComprada;
                break;
            case 3:
                valorTotal = precoProduto3 * quantidadeComprada;
                break;
            default:
                System.out.println("Código de produto inválido. Por favor, digite 1, 2 ou 3.");
                return;
        }

        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorTotal);
    }
}
