package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador0a100 = 0;
        int contador101a200 = 0;
        int contadorMaior200 = 0;

       for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "� n�mero: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador0a100++;
            } else if (numero >= 101 && numero <= 200) {
                contador101a200++;
            } else if (numero > 200) {
                contadorMaior200++;
            }
        }

        System.out.println("Quantidade de n�meros entre 0 e 100: " + contador0a100);
        System.out.println("Quantidade de n�meros entre 101 e 200: " + contador101a200);
        System.out.println("Quantidade de n�meros maiores que 200: " + contadorMaior200);

        scanner.close();
    }
}
