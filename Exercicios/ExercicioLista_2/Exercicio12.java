package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("\nO �ndice de Massa Corporal (IMC) �: %.2f\n", imc);

        scanner.close();
    }
}
