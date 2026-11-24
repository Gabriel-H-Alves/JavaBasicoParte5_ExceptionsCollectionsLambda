/*
 * Exercicio 10 - Generics Simples:
 * Classe generica CaixaArmazenamento<T> capaz de guardar qualquer tipo de objeto.
 */

import java.util.Scanner;

class CaixaArmazenamento<T> {
    private T itemGuardado;

    public void guardar(T item) {
        this.itemGuardado = item;
    }

    public T obter() {
        return itemGuardado;
    }
}

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CaixaArmazenamento<String> caixaTexto = new CaixaArmazenamento<>();
        CaixaArmazenamento<Integer> caixaNumero = new CaixaArmazenamento<>();

        System.out.print("Digite uma mensagem de texto para a caixa: ");
        caixaTexto.guardar(sc.nextLine());

        System.out.print("Digite um numero inteiro para a caixa: ");
        caixaNumero.guardar(sc.nextInt());

        System.out.println("Conteudo da Caixa de Texto: " + caixaTexto.obter());
        System.out.println("Conteudo da Caixa de Numero: " + caixaNumero.obter());

        sc.close();
    }
}
