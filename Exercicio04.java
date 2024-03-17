public class Exercicio04 {
    public static void executar(){

        int[] vetor = new int[5];
        Prompt.imprimir("Digite os 5 números:");
        for (int i = 0; i < 5; i++) {
            vetor[i] = Prompt.lerInteiro();
        }
        
        int n = Prompt.lerInteiro("Digite o valor de n: ");
        
        Prompt.imprimir("Índices dos elementos inferiores a " + n + ":");
        for (int i = 0; i < 5; i++) {
            if (vetor[i] < n) {
                Prompt.imprimir(i);
            }
        }
    }
}
