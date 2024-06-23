package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        
        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + " °F");

        scanner.close();
    }
}
