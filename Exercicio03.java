public class Exercicio03 {
    public static void executar() {
        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = Prompt.lerInteiro();

        int[] vetor1 = new int[tamanho];

        System.out.println("Informe os números do vetor: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            vetor1[i] = Prompt.lerInteiro();
        }

        int[] vetor2 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = vetor1[i] * 2;
        }

        System.out.println("O valor do dobro dos números informados no primeiro vetor é: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor2[i] + " ");
        }

        Prompt.linhaEmBranco();
    }
}
