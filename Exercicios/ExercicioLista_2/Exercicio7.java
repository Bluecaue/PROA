package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        double comissao = salarioBase * 0.05;

        double salarioLiquido = salarioBase + comissao;

        System.out.println("O salário líquido do funcionário é: R$" + salarioLiquido);

        scanner.close();
    }
}
