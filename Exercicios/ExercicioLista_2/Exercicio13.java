package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.printf("\n%d é múltiplo de %d.\n", numero1, numero2);
        } else {
            System.out.printf("\n%d não é múltiplo de %d.\n", numero1, numero2);
        }

        scanner.close();
    }
}
