/*
 * Exercicio 13 - Predicate e removeIf:
 * Remove numeros negativos de uma lista usando removeIf com condicao lambda.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero (positivo ou negativo): ");
            listaNumeros.add(sc.nextInt());
        }

        System.out.println("Lista original: " + listaNumeros);

        listaNumeros.removeIf(n -> n < 0);

        System.out.println("Lista apenas com numeros positivos/zero: " + listaNumeros);

        sc.close();
    }
}
