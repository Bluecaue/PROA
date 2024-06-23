package ExercicioLista_2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * raio * raio;

        double perimetro = 2 * Math.PI * raio;

        System.out.println("Dados do círculo com raio " + raio + ":");
        System.out.println("Área: " + area);
        System.out.println("Perímetro (Circunferência): " + perimetro);

        scanner.close();
    }

}
