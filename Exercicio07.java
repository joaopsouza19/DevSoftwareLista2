public class Exercicio07 {
    public static void executar(){
        double[] vetor1 = new double[5];
        double[] vetor2 = new double[5];

        Prompt.imprimir("Informe os cincos números do primeiro vetor: ");
        for(int i = 0; i < 5; i++){
            vetor1[i] = Prompt.lerDecimal();
        }
        Prompt.imprimir("Informe os cincos números do segundo vetor: ");
        for(int i = 0; i < 5; i++){
            vetor2[i] = Prompt.lerDecimal();
        }

        boolean iguais = true;

        for(int i = 0; i < 5; i++){
            if(vetor1[i] != vetor2[i]){
                iguais = false;
                break;
            } 
        }
        if(iguais){
            Prompt.imprimir("São iguais.");
        } else {
            Prompt.imprimir("não sao iguais");
        }

    }
}
