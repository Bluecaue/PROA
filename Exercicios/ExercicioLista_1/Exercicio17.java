package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorMaioresIdade = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                contadorMaioresIdade++;
            }
        }

        System.out.println("Número de pessoas maiores de idade: " + contadorMaioresIdade);

        scanner.close();
    }
}
