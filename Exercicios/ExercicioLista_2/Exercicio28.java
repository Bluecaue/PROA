package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = scanner.nextDouble();

        scanner.close();

        double imc = peso / (altura * altura);

        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25.0) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30.0) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc < 35.0) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc < 40.0) {
            System.out.println("Classificação: Obesidade grau II (severa)");
        } else {
            System.out.println("Classificação: Obesidade grau III (mórbida)");
        }
    }
}
