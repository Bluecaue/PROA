package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas efetuadas pelo vendedor: ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;

        double salarioFinal = salarioFixo + comissao;

        System.out.println("\nNome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário final no final do mês: R$ " + salarioFinal);

        scanner.close();
    }
}
