package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        scanner.close();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Parabéns! O aluno foi APROVADO com média " + media);
        } else {
            System.out.println("Infelizmente, o aluno foi REPROVADO com média " + media);
        }
    }
}
