package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro n�mero inteiro: ");
        int num3 = scanner.nextInt();

        scanner.close();

        int menor, meio, maior;

        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                meio = num2;
                maior = num3;
            } else {
                meio = num3;
                maior = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                meio = num1;
                maior = num3;
            } else {
                meio = num3;
                maior = num1;
            }
        } else { 
            menor = num3;
            if (num1 <= num2) {
                meio = num1;
                maior = num2;
            } else {
                meio = num2;
                maior = num1;
            }
        }

        System.out.println("N�meros em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
