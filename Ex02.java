/*
 * Exercicio 02 - InputMismatchException com Scanner:
 * Trata caso o usuario digite texto em vez de um numero inteiro.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade em anos: ");
            int idadeUsuario = sc.nextInt();
            System.out.println("Idade digitada: " + idadeUsuario + " anos.");
        } catch (InputMismatchException erro) {
            System.out.println("Erro: Entrada invalida. Por favor, digite apenas numeros inteiros.");
        }

        sc.close();
    }
}
