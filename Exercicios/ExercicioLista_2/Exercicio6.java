package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " � um n�mero par.");
        } else {
            System.out.println(numero + " � um n�mero �mpar.");
        }

        scanner.close();
    }

}
