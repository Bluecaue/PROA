package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMenorIdade = 0;
        int countMaiorIdade = 0;

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = scanner.nextInt();

        for (int i = 1; i <= numPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade < 18) {
                countMenorIdade++;
            } else {
                countMaiorIdade++;
            }
        }

        scanner.close();

        System.out.println("Quantidade de pessoas menores de idade: " + countMenorIdade);
        System.out.println("Quantidade de pessoas maiores de idade: " + countMaiorIdade);
    }
}
