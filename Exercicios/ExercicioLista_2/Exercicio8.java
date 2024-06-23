package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("\nApós a troca:");
        System.out.println("Primeiro número: " + numero1);
        System.out.println("Segundo número: " + numero2);

        scanner.close();
    }
}
