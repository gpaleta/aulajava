import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        int operacao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qual opecao deseja soma = 0 subtracao = 1 divicao = 2 multiplicacao = 3");
        operacao = sc.nextInt();
        System.out.println("Digite o primeiro numero");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = sc.nextInt();
        int resultadoSoma = soma(num1, num2);
        int resultadoSub = subtracao(num1, num2);
        int resultadoMult = multiplicacao(num1, num2);
        double resultadoDiv = divisao(num1, num2);
        switch (operacao) {
            case 0:
                System.out.println("A soma e = " + resultadoSoma);
                sc.close();
                break;
            case 1:
                System.out.println("A subtracao e = " + resultadoSub);
                sc.close();
                break;
            case 2:
                System.out.println("A divisao e = " + resultadoDiv);
                sc.close();
                break;
            case 3:
                System.out.println("A multiplicacao e = " + resultadoMult);
                sc.close();
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }

    /**
     * Essa função soma os valores
     * @param number1 Primeiro número inteiro
     * @param number2 Segundo número inteiro
     * @return Retorna a soma dos números inteiros recebidos, retorna um inteiro
     */
    public static int soma(int number1, int number2){
        return number1 + number2;
    }

    /**
     *  Essa função subtrai os valores
     * @param number1 Primeiro número inteiro
     * @param number2 Segundo número inteiro
     * @return Retorna a diferença dos números inteiros recebidos, retorna um inteiro
     */
    public static int subtracao(int number1, int number2){
        return number1 - number2;
    }

    /**
     *  Essa função multiplica os valores
     * @param number1 Primeiro número inteiro
     * @param number2 Segundo número inteiro
     * @return Retorna o produto dos números inteiros recebidos, retorna um inteiro
     */
    public static int multiplicacao(int number1, int number2){
        return number1 * number2;
    }

    /**
     *  Essa função divide os valores
     * @param number1 Primeiro número double
     * @param number2 Segundo número double
     * @return Retorna a divisão dos números doubles recebidos, retorna um double
     */
    public static double divisao(double number1, double number2){
        return number1/number2;
    }

    /**
     *  Essa função soma os valores
     * @param valor1 Primeiro número double
     * @param valor2 Segundo número double
     * @param valor3 Terceiro número double
     * @param valor4 Quarto número double
     * @return Retorna a soma dos números doubles recebidos, retorna um double
     */
    public static double somaTudo(double valor1, double valor2, double valor3, double valor4) {
        return valor1 + valor2 + valor3 + valor4;
    }

}