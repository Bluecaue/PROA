package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        scanner.close();

        if (idade < 0) {
            System.out.println("Idade inválida. Por favor, digite uma idade válida.");
        } else if (idade <= 12) {
            System.out.println("A pessoa é uma criança.");
        } else if (idade <= 17) {
            System.out.println("A pessoa é um adolescente.");
        } else if (idade <= 59) {
            System.out.println("A pessoa é um adulto.");
        } else {
            System.out.println("A pessoa é um idoso.");
        }
    }
}
