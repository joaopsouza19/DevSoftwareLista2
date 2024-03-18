public class Exercicio09 {
    public static void executar(){

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor A:");
        }
        
        for (int i = 0; i < B.length; i++) {
            B[i] = Prompt.lerInteiro("Digite o elemento " + (i + 1) + " do vetor B:");
        }
        
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) { 
                C[i] = A[i / 2];
            } else { 
                C[i] = B[i / 2];
            }
        }
        
        Prompt.separador();
        Prompt.imprimir("Vetor C:");
        for (int i = 0; i < C.length; i++) {
            Prompt.imprimir(C[i]);
        }
        Prompt.separador();
    }
}
