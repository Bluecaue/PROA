package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "� n�mero: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de n�meros entre 0 e 100: " + contador);

        scanner.close();
    }
}
