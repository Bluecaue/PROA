package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero real: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo n�mero real: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro n�mero real: ");
        double numero3 = scanner.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("\nA m�dia aritm�tica dos n�meros �: " + media);

        scanner.close();
    }
}
