package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaIdades = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "� pessoa: ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double mediaIdades = (double) somaIdades / 20;

        System.out.println("A m�dia das idades das 20 pessoas �: " + mediaIdades);

        scanner.close();
    }
}
