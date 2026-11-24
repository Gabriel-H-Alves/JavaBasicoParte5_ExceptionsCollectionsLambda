/*
 * Exercicio 12 - Interface Funcional Customizada com Lambda:
 * Interface CalculadoraOperacao e implementacao de operacoes com lambda.
 */

import java.util.Scanner;

@FunctionalInterface
interface CalculadoraOperacao {
    double executar(double valor01, double valor02);
}

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CalculadoraOperacao soma = (v1, v2) -> v1 + v2;
        CalculadoraOperacao multiplicacao = (v1, v2) -> v1 * v2;

        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Soma via lambda: " + soma.executar(num1, num2));
        System.out.println("Multiplicacao via lambda: " + multiplicacao.executar(num1, num2));

        sc.close();
    }
}
