/*
 * Exercicio 18 - Stream API com reduce:
 * Calcula a soma total de uma lista de valores inteiros usando reduce.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            numeros.add(sc.nextInt());
        }

        int somaTotal = numeros.stream()
                .reduce(0, (subtotal, elemento) -> subtotal + elemento);

        System.out.println("Soma total calculada com reduce: " + somaTotal);

        sc.close();
    }
}
