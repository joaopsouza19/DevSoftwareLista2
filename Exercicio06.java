public class Exercicio06 {
    public static void executar(){
        
        double[] vetorNota = new double[5];
        Prompt.imprimir("Digite as cinco notas do aluno: ");
        for(int i = 0; i < 5; i++){
            vetorNota[i] = Prompt.lerDecimal();
        }

        double[] vetorPeso = new double[5];
        Prompt.imprimir("Digite o valor dos pesos da nota: ");
        for(int i = 0; i < 5; i++){
            vetorPeso[i] = Prompt.lerDecimal();
        }

        double somaNota = 0;
        double somaPeso = 0;

        for(int i = 0; i < 5; i++){
            somaNota += vetorNota[i] * vetorPeso [i];
            somaPeso += vetorPeso[i];
        }

        double media = somaNota / somaPeso;

        // double media = 
        // ((vetorNota[0] * vetorPeso[0]) + 
        // (vetorNota[1] * vetorPeso[1]) +
        // (vetorNota[2] * vetorPeso[2]) + 
        // (vetorNota[3] * vetorPeso[3]) + 
        // (vetorNota[4] * vetorPeso[4])) / 
        // (vetorPeso[0] + vetorPeso[1] + vetorPeso[2] + vetorPeso[3] + vetorPeso[4]);
        Prompt.imprimir("A média ponderada do aluno é: " + media);
        
    }
}
