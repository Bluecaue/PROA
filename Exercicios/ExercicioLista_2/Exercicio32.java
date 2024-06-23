package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        char conceito;

        if (nota >= 9.0) {
            conceito = 'A';
        } else if (nota >= 7.5) {
            conceito = 'B';
        } else if (nota >= 6.0) {
            conceito = 'C';
        } else if (nota >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Conceito do aluno: " + conceito);

        scanner.close();
    }
}
