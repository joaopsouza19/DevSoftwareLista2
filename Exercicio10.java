public class Exercicio10 {
    public static void executar(){
        double[] vetorA = new double[5];
        double[] vetorB = new double[5];
        
        Prompt.imprimir("Informe os cincos números do primeiro vetor: ");
        for(int i = 0; i < 5; i++){
            vetorA[i] = Prompt.lerDecimal();
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[vetorA.length - 1 - i];
        }

        Prompt.imprimir("Vetor B: ");
        for(int i = 0; i < vetorB.length; i++){
            Prompt.imprimir(vetorB[i] + " ");
        }

    }
}
