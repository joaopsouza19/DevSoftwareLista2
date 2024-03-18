public class Exercicio03 {
    public static void executar() {
        Prompt.imprimir("Informe o tamanho do vetor: ");
        int tamanho = Prompt.lerInteiro();

        int[] vetor1 = new int[tamanho];

        Prompt.imprimir("Informe os números do vetor: ");
        for (int i = 0; i < vetor1.length; i++) {
            Prompt.imprimir("Número " + (i + 1) + ": ");
            vetor1[i] = Prompt.lerInteiro();
        }

        int[] vetor2 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = vetor1[i] * 2;
        }

        Prompt.imprimir("O valor do dobro dos números informados no primeiro vetor é: ");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir(vetor2[i] + " ");
        }

        Prompt.linhaEmBranco();
    }
}
