package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota (de 0 a 10): ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota (de 0 a 10): ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota (de 0 a 10): ");
        double nota3 = scanner.nextDouble();

        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;

        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("A média ponderada das notas é: " + mediaPonderada);

        scanner.close();
    }

}
