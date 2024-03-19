public class Exercicio12 {
    public static void executar() {
        int[] vetor = new int[12];

        Prompt.imprimir("Informe os 12 números do vetor: ");
        for (int i = 0; i < 12; i++) {
            vetor[i] = Prompt.lerInteiro();
        }

        int resultado = 1;

        for (int i = 0; i < 12; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                resultado *= vetor[i];
            }
        }

        Prompt.imprimir("Resultado: " + resultado);
    }
}
