public class Exercicio13 {

    public static void executar(){

        Prompt.imprimir("Digite a quantidade de numeros da sequencia de fibonacci desejada: ");
        int tamanho = Prompt.lerInteiro();
        int[] vetor = fibonacci(tamanho);

        Prompt.imprimir("Sequência de Fibonacci com " + tamanho + " termos:");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir(vetor[i] + " ");
        }
        Prompt.imprimir(' ');
    }

    public static int[] fibonacci(int n) {
        int[] vetor = new int[n];
        vetor[0] = 1;
        if (n > 1) {
            vetor[1] = 1;
            for (int i = 2; i < n; i++) {
                vetor[i] = vetor[i - 1] + vetor[i - 2];
            }
        }
        return vetor;
    }
}