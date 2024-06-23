package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite o turno do aluno (M - Matutino / V - Vespertino): ");
        char turno = scanner.next().charAt(0);

        String saudacao;
        if (turno == 'M') {
            saudacao = "Bom dia, " + nomeAluno;
        } else if (turno == 'V') {
            saudacao = "Boa tarde, " + nomeAluno;
        } else {
            saudacao = "Turno não reconhecido";
        }

        System.out.println(saudacao);

        scanner.close();
    }
}
