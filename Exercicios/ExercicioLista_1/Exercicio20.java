package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorMaioresQue8 = 0;

       for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > 8) {
                contadorMaioresQue8++;
            }
        }

        System.out.println("Quantidade de números maiores que 8: " + contadorMaioresQue8);

        scanner.close();
    }
}
