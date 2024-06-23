package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        double divisao = 0;
        if (numero2 != 0) {
            divisao = (double) numero1 / numero2;
        }

        System.out.println("Resultados:");
        System.out.println(numero1 + " + " + numero2 + " = " + soma);
        System.out.println(numero1 + " - " + numero2 + " = " + subtracao);
        System.out.println(numero1 + " * " + numero2 + " = " + multiplicacao);
        System.out.println(numero1 + " / " + numero2 + " = " + divisao);

        scanner.close();
    }
}
