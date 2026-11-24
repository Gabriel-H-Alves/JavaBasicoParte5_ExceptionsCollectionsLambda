/*
 * Exercicio 14 - Stream API (filter e count):
 * Filtra palavras que possuem mais de 5 caracteres e conta o total.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras.add(sc.nextLine());
        }

        long palavrasLongas = palavras.stream()
                .filter(p -> p.length() > 5)
                .count();

        System.out.println("Total de palavras com mais de 5 caracteres: " + palavrasLongas);

        sc.close();
    }
}
