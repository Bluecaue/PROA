package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sal�rio do funcion�rio: ");
        double salario = scanner.nextDouble();

        scanner.close();

        double bonus;

        if (salario > 2000) {
            bonus = salario * 0.10;
        } else {
            bonus = salario * 0.05; 
        }

        System.out.printf("O valor do b�nus � R$ %.2f%n", bonus);
    }
}
