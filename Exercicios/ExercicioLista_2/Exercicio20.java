package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero % 2 == 0) {
            System.out.println("O n�mero " + numero + " � par.");
        } else {
            System.out.println("O n�mero " + numero + " � �mpar.");
        }
    }
}
