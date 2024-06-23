package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Antecessor de " + numero + " é: " + antecessor);
        System.out.println("Sucessor de " + numero + " é: " + sucessor);

        scanner.close();
    }
}
