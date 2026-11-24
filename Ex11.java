/*
 * Exercicio 11 - Expressao Lambda com Consumer e forEach:
 * Percorre uma lista de nomes imprimindo cada item em maiusculo com expressao lambda.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaPessoas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "o nome: ");
            listaPessoas.add(sc.nextLine());
        }

        System.out.println("Nomes processados com Lambda:");
        listaPessoas.forEach(nome -> System.out.println("-> " + nome.toUpperCase()));

        sc.close();
    }
}
