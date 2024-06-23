package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero % 10 == 0) {
            System.out.println(numero + " é divisível por 10.");
        } else if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5, mas não por 10.");
        } else if (numero % 2 == 0) {
            System.out.println(numero + " é divisível por 2, mas não por 5 nem por 10.");
        } else {
            System.out.println(numero + " não é divisível por 10, 5 ou 2.");
        }

        scanner.close();
    }
}
