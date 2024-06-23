package ExercicioLista_1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o prato que deseja: ");
        System.out.println("1- Vegetariano");
        System.out.println("2- Peixe");
        System.out.println("3- Frango");
        System.out.println("4- Carne");
        int prato = scanner.nextInt();

        System.out.println("Digite a sobremesa que deseja: ");
        System.out.println("1- Abacaxi");
        System.out.println("2- Sorvete diet");
        System.out.println("3- Mousse diet");
        System.out.println("4- Mousse chocolate");
        int sobremesa = scanner.nextInt();

        System.out.println("Digite a bebida que deseja: ");
        System.out.println("1- Chá");
        System.out.println("2- Suco de laranja");
        System.out.println("3- Suco de melão");
        System.out.println("4- Refrigerante diet");
        int bebida = scanner.nextInt();

        int caloriasPrato = Calorias.calcularCalorias("prato", prato);
        int caloriasSobremesa = Calorias.calcularCalorias("sobremesa", sobremesa);
        int caloriasBebida = Calorias.calcularCalorias("bebida", bebida);

        int caloriasTotais = caloriasPrato + caloriasSobremesa + caloriasBebida;

        System.out.println("Calorias do prato escolhido: " + caloriasPrato);
        System.out.println("Calorias da sobremesa escolhida: " + caloriasSobremesa);
        System.out.println("Calorias da bebida escolhida: " + caloriasBebida);
        System.out.println("Calorias totais: " + caloriasTotais);

        scanner.close();
    }
}

class Calorias {

    public static int calcularCalorias(String produto, int opcaoEscolhida) {
        switch (produto) {
            case "prato":
                switch (opcaoEscolhida) {
                    case 1: // Vegetariano
                        return 180;
                    case 2: // Peixe
                        return 230;
                    case 3: // Frango
                        return 250;
                    case 4: // Carne
                        return 350;
                    default:
                        break;
                }
                break;

            case "sobremesa":
                switch (opcaoEscolhida) {
                    case 1: // Abacaxi
                        return 75;
                    case 2: // Sorvete diet
                        return 110;
                    case 3: // Mousse diet
                        return 170;
                    case 4: // Mousse chocolate
                        return 200;
                    default:
                        break;
                }
                break;

            case "bebida":
                switch (opcaoEscolhida) {
                    case 1: // Chá
                        return 20;
                    case 2: // Suco de laranja
                        return 70;
                    case 3: // Suco de melão
                        return 100;
                    case 4: // Refrigerante diet
                        return 65;
                    default:
                        break;
                }
                break;
        }
        return 0; // Retorna 0 se opção inválida
    }
}
