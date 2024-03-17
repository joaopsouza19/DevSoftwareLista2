public class Exercicio01 {

    public static void executar() {
        double[] numeros = new double[5];

        Prompt.imprimir("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Prompt.lerDecimal("Número " + (i + 1) + ": ");
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.length;

        Prompt.linhaEmBranco();
        Prompt.imprimir("Média: " + media);
        Prompt.imprimir("Valores menores que a média:");
        for (double numero : numeros) {
            if (numero < media) {
                Prompt.imprimir(numero);
            }
        }
        Prompt.imprimir("Valores iguais à média:");
        for (double numero : numeros) {
            if (numero == media) {
                Prompt.imprimir(numero);
            }
        }
        Prompt.imprimir("Valores superiores à média:");
        for (double numero : numeros) {
            if (numero > media) {
                Prompt.imprimir(numero);
            }
        }
    }
}
