package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        scanner.close();

        double novoSalario = calcularNovoSalario(salarioAtual);

        System.out.printf("O novo salário do funcionário com 15%% de aumento é R$ %.2f%n", novoSalario);
    }

    public static double calcularNovoSalario(double salarioAtual) {
        double aumento = salarioAtual * 0.15;
        double novoSalario = salarioAtual + aumento;
        return novoSalario;
    }
}
