/*
 * Exercicio 03 - Bloco Finally:
 * Demonstra o uso do bloco finally que sempre executa, mesmo se houver erro.
 */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um valor: ");
            int valor = sc.nextInt();
            System.out.println("O dobro e: " + (valor * 2));
        } catch (Exception erro) {
            System.out.println("Houve uma falha na leitura do valor.");
        } finally {
            System.out.println("Bloco finally executado: limpeza e encerramento de rotina.");
        }

        sc.close();
    }
}
