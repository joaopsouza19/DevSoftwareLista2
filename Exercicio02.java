public class Exercicio02 {
    public static void executar() {
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = Prompt.lerInteiro();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os números do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
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
