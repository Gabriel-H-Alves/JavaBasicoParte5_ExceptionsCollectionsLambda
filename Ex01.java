/*
 * Exercicio 01 - Try-Catch com divisao por zero (ArithmeticException):
 * Trata excecao de divisao por zero informando mensagem amigavel ao usuario.
 */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o numerador: ");
            int numerador = sc.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = sc.nextInt();

            int quociente = numerador / denominador;
            System.out.println("Resultado da divisao: " + quociente);
        } catch (ArithmeticException erro) {
            System.out.println("Erro: Nao e possivel dividir um numero por zero!");
        }

        sc.close();
    }
}
