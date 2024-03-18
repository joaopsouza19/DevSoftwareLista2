public class Exercicio02 {
    public static void executar() {
        Prompt.imprimir("Digite o tamanho do vetor: ");
        int tamanho = Prompt.lerInteiro();

        int[] vetor = new int[tamanho];

        Prompt.imprimir("Digite os números do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            Prompt.imprimir("Número " + (i + 1) + ": ");
            vetor[i] = Prompt.lerInteiro();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                Prompt.imprimir("Número " + vetor[i] + " na posição " + i + " é positivo");
            } else if (vetor[i] < 0) {
                Prompt.imprimir("Número " + vetor[i] + " na posição " + i + " é negativo");
            } else {
                Prompt.imprimir("Número " + vetor[i] + " na posição " + i + " é zero");
            }
        }

        Prompt.linhaEmBranco();
    }
}
