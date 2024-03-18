public class Exercicio08 {
    public static void executar(){
        double[] vetorA = new double[5];
        double[] vetorB = new double[5];
        double[] vetorC = new double[vetorA.length + vetorB.length];

        Prompt.imprimir("Informe os cincos números do primeiro vetor: ");
        for(int i = 0; i < 5; i++){
            vetorA[i] = Prompt.lerDecimal();
        }
        Prompt.imprimir("Informe os cincos números do segundo vetor: ");
        for(int i = 0; i < 5; i++){
            vetorB[i] = Prompt.lerDecimal();
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        
        for (int i = 0; i < vetorB.length; i++) {
            vetorC[vetorA.length + i] = vetorB[i];
        }

        Prompt.imprimir("Vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            Prompt.imprimir(vetorC[i] + " ");
        }


    }
}
