import java.util.Scanner;

public class Exercicio03 {
    public static void executar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor1 = new int[tamanho];

        System.out.println("Informe os números do vetor: ");
        for(int i = 0; i < vetor1.length; i++){
            System.out.println("Número " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        int[] vetor2 = new int[tamanho];
        for(int i = 0; i < tamanho; i++){
            vetor2[i] = vetor1[i] * 2;
        }

        System.out.println("O valor do dobro dos números informados no primeiro vetor é: ");
        for(int i = 0; i < tamanho; i++){
            System.out.println(vetor2[i] + " ");
        }

        scanner.close();
    }

}