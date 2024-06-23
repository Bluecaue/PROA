package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        System.out.println("A soma das idades das 20 pessoas é: " + somaIdades);

        scanner.close();
    }
}
