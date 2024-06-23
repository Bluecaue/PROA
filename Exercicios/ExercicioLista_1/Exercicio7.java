package ExercicioLista_1;

public class Exercicio7 {

    public static void main(String[] args) {
        int media1 = calcularMedia(8, 9, 7);

        int media2 = calcularMedia(4, 5, 6);

        int somaDasMedias = media1 + media2;

        double mediaDasMedias = (double) somaDasMedias / 2;

        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + somaDasMedias);
        System.out.println("Média das médias: " + mediaDasMedias);
    }

    public static int calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
}
