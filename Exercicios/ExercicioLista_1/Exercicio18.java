package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);

        scanner.close();
    }
}
