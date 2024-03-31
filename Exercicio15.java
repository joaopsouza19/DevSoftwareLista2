public class Exercicio15 {

    public static void executar(){

        int[] vetor = new int[5];

        Prompt.imprimir("Informe o primeiro número: ");
        vetor[0] = Prompt.lerInteiro();

        for(int i = 1; i < 5;){
            Prompt.imprimir("Informe o próximo número maior que " + vetor[i-1] + ": ");
            int numero = Prompt.lerInteiro();
            if(numero > vetor[i-1]){
                vetor[i++] = numero;
            }else{
                Prompt.imprimir("--> O numero deve ser maior que o anterior.");
            }
        }

        Prompt.imprimir("Resultado: ");
        for(int i = 0; i < 5; i++){
            Prompt.imprimir(vetor[i] + " ");
        }
    }
}