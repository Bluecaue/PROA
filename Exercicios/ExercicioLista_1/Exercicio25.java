package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        System.out.println("Digite uma sequência de números (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }
}
