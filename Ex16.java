/*
 * Exercicio 16 - Comparator com Lambda:
 * Ordena lista de produtos pelo preco em ordem crescente usando Comparator.
 */

import java.util.ArrayList;
import java.util.Scanner;

class ItemVenda {
    String nomeItem;
    double precoItem;

    public ItemVenda(String nome, double preco) {
        this.nomeItem = nome;
        this.precoItem = preco;
    }
}

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemVenda> itens = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Nome do item " + (i + 1) + ": ");
            String nome = sc.next();
            System.out.print("Preco: ");
            double preco = sc.nextDouble();
            itens.add(new ItemVenda(nome, preco));
        }

        itens.sort((item1, item2) -> Double.compare(item1.precoItem, item2.precoItem));

        System.out.println("Itens ordenados pelo preco:");
        for (ItemVenda atual : itens) {
            System.out.println(atual.nomeItem + " - R$ " + atual.precoItem);
        }

        sc.close();
    }
}
