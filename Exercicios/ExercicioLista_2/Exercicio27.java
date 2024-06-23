package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o sexo da pessoa (M ou F): ");
        char sexo = scanner.next().charAt(0); 

        scanner.close();

        if (sexo == 'M') {
            if (idade >= 65) {
                System.out.println("Esta pessoa pode se aposentar.");
            } else {
                System.out.println("Esta pessoa ainda não pode se aposentar.");
            }
        } else if (sexo == 'F') {
            if (idade >= 60) {
                System.out.println("Esta pessoa pode se aposentar.");
            } else {
                System.out.println("Esta pessoa ainda não pode se aposentar.");
            }
        } else {
            System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
        }
    }
}
