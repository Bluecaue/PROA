package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        double ipi = scanner.nextDouble();

        System.out.print("Digite o c�digo da pe�a 1: ");
        int codigoPeca1 = scanner.nextInt();
        System.out.print("Digite o valor unit�rio da pe�a 1: ");
        double valorUnitarioPeca1 = scanner.nextDouble();
        System.out.print("Digite a quantidade de pe�as 1: ");
        int quantidadePeca1 = scanner.nextInt();

        System.out.print("Digite o c�digo da pe�a 2: ");
        int codigoPeca2 = scanner.nextInt();
        System.out.print("Digite o valor unit�rio da pe�a 2: ");
        double valorUnitarioPeca2 = scanner.nextDouble();
        System.out.print("Digite a quantidade de pe�as 2: ");
        int quantidadePeca2 = scanner.nextInt();

        double valorTotal = (valorUnitarioPeca1 * quantidadePeca1 + valorUnitarioPeca2 * quantidadePeca2) * (ipi / 100 + 1);

        System.out.println("Valor total a ser pago: R$ " + valorTotal);

        scanner.close();
    }
}
