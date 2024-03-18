public class Exercicio05 {
    public static void executar(){

        double[] vetor = new double[5];
        Prompt.imprimir("Digite os 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerDecimal();
        }
        
        double n = Prompt.lerDecimal("Digite o valor de n: ");

        int vezes = 0;
        
        Prompt.imprimir("Quantidade de vezes que o número N aparece no vetor: ");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] == n) {
                vezes++;
            }
        }

        Prompt.imprimir(vezes);
    }
}