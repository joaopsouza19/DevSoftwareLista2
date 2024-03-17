import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println("Número " + vetor[i] + " na posição " + i + " é positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Número " + vetor[i] + " na posição " + i + " é negativo");
            } else {
                System.out.println("Número " + vetor[i] + " na posição " + i + " é zero");
            }
        }

        scanner.close();
    }
}
