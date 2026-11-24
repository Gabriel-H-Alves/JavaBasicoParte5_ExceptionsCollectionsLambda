/*
 * Exercicio 09 - HashMap (chave e valor):
 * Mapeia sigla de estado para nome completo e permite consulta por sigla.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> estados = new HashMap<>();

        estados.put("SP", "Sao Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("MG", "Minas Gerais");
        estados.put("RS", "Rio Grande do Sul");

        System.out.print("Digite a sigla do estado para consultar (SP, RJ, MG, RS): ");
        String sigla = sc.next().toUpperCase();

        if (estados.containsKey(sigla)) {
            System.out.println("Estado correspondente: " + estados.get(sigla));
        } else {
            System.out.println("Sigla nao cadastrada no sistema.");
        }

        sc.close();
    }
}
