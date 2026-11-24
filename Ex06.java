/*
 * Exercicio 06 - ArrayList com remocao por valor ou indice:
 * Cadastra produtos em uma lista e remove o item especificado pelo usuario.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listaItens = new ArrayList<>();

        listaItens.add("Arroz");
        listaItens.add("Feijao");
        listaItens.add("Macarrao");
        listaItens.add("Leite");

        System.out.println("Itens atuais: " + listaItens);
        System.out.print("Digite o nome do item que deseja remover: ");
        String itemRemover = sc.nextLine();

        if (listaItens.remove(itemRemover)) {
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item nao encontrado na lista.");
        }

        System.out.println("Lista atualizada: " + listaItens);

        sc.close();
    }
}
