/*
 * Exercicio 07 - Collections.sort com ArrayList:
 * Ordena alfabeticamente uma lista de cidades digitadas pelo usuario.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaCidades = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome da cidade " + (i + 1) + ": ");
            listaCidades.add(sc.nextLine());
        }

        Collections.sort(listaCidades);

        System.out.println("Cidades ordenadas alfabeticamente:");
        for (String cidade : listaCidades) {
            System.out.println(cidade);
        }

        sc.close();
    }
}
