package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        double salarioMinimo = 1212.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do sal�rio do usu�rio: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        System.out.println("O usu�rio ganha " + quantidadeSalariosMinimos + " sal�rios m�nimos.");

        scanner.close();
    }
}
