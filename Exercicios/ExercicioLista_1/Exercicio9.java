package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        double salarioMinimo = 1212.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");

        scanner.close();
    }
}
