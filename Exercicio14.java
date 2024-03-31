public class Exercicio14 {

    public static void executar(){

        int[] vetor = new int[5];

        Prompt.imprimir("Informe os cinco números do vetor: ");
        for(int i = 0; i < 5; i++){
            vetor[i] = Prompt.lerInteiro();
        }

        int maior = 0;

        for(int i = 1; i < 5; i++){
            if(vetor[i] > vetor[maior]){
                maior = i;
            }
        }

        int x = vetor[4];
        vetor[4] = vetor[maior];
        vetor[maior] = x;

        Prompt.imprimir("A ordem é: " + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + ", " + vetor[4]);
    }
}