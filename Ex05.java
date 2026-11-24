/*
 * Exercicio 05 - ArrayList basico:
 * Adiciona nomes informados pelo usuario em um ArrayList e percorre a lista.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + (i + 1) + "o nome: ");
            String nome = sc.nextLine();
            listaNomes.add(nome);
        }

        System.out.println("Nomes na lista:");
        for (String nomeAtual : listaNomes) {
            System.out.println("- " + nomeAtual);
        }

        sc.close();
    }
}
