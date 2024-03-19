public class Exercicio11 {
    public static void executar() {
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

        Prompt.imprimir("Informe os números do primeiro vetor: ");
        for (int i = 0; i < 5; i++) {
            vetor1[i] = Prompt.lerInteiro();
        }

        Prompt.imprimir("Informe os números do segundo vetor: ");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = Prompt.lerInteiro();
        }

        int vetorNovo = 0;

        for (int i = 0; i < 5; i++) {
            vetorNovo += (vetor1[i] * vetor2[i]);
        }

        // int vetorNovo =
        // (vetor1[0] * vetor2[0]) +
        // (vetor1[1] * vetor2[1]) +
        // (vetor1[2] * vetor2[2]) +
        // (vetor1[3] * vetor2[3]) +
        // (vetor1[4] * vetor2[4]);

        Prompt.imprimir("O resultado do cálculo é: " + vetorNovo);

    }
}
