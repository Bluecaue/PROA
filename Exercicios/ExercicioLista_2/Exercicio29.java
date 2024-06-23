package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio29 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        scanner.close();

        if (nota >= 7.0) {
            System.out.println("Situação de " + nome + ": APROVADO");
        } else {
            System.out.println("Situação de " + nome + ": EM RECUPERAÇÃO");
        }
    }
}
