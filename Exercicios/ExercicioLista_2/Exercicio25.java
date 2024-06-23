package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de faltas do aluno: ");
        int numFaltas = scanner.nextInt();

        scanner.close();

        if (numFaltas > 15) {
            System.out.println("Situação do aluno: REPROVADO por falta");
        } else {
            System.out.println("Situação do aluno: APROVADO");
        }
    }
}
