package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do sal�rio m�nimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o sal�rio do funcion�rio: ");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("O funcion�rio recebe aproximadamente " + quantidadeSalariosMinimos + " sal�rios m�nimos.");

        scanner.close();
    }
}
