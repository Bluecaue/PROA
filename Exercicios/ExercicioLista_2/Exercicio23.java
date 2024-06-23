package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                          "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int[] dias = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        System.out.print("Digite o nome de um mês (com letras minúsculas): ");
        String mes = scanner.nextLine();

        scanner.close();

        int indice = -1;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(mes)) {
                indice = i;
                break;
            }
        }

        if (indice != -1) {
            System.out.printf("O mês de %s possui %d dias.%n", meses[indice], dias[indice]);
        } else {
            System.out.println("Mês inválido. Por favor, digite um mês válido.");
        }
    }
}
