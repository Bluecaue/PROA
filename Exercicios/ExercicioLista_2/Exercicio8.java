package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int numero2 = scanner.nextInt();

        int temp = numero1;
        numero1 = numero2;
        numero2 = temp;

        System.out.println("\nAp�s a troca:");
        System.out.println("Primeiro n�mero: " + numero1);
        System.out.println("Segundo n�mero: " + numero2);

        scanner.close();
    }
}
