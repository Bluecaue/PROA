package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho",
                          "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int[] dias = {31, 28, 31, 30, 31, 30,
                      31, 31, 30, 31, 30, 31};

        System.out.print("Digite o nome de um m�s (com letras min�sculas): ");
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
            System.out.printf("O m�s de %s possui %d dias.%n", meses[indice], dias[indice]);
        } else {
            System.out.println("M�s inv�lido. Por favor, digite um m�s v�lido.");
        }
    }
}
