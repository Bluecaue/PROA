package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        double numero = scanner.nextDouble();

        scanner.close();

        if (numero > 0) {
            System.out.println("O n�mero digitado � positivo.");
        } else if (numero < 0) {
            System.out.println("O n�mero digitado � negativo.");
        } else {
            System.out.println("O n�mero digitado � zero.");
        }
    }
}
