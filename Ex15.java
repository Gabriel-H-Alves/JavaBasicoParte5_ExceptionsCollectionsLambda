/*
 * Exercicio 15 - Stream API (map e collect):
 * Converte precos de produtos aplicando 10% de acrescimo com map.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o preco " + (i + 1) + ": ");
            precos.add(sc.nextDouble());
        }

        List<Double> precosComAcrescimo = precos.stream()
                .map(preco -> preco * 1.10)
                .collect(Collectors.toList());

        System.out.println("Precos originais: " + precos);
        System.out.println("Precos reajustados (+10%): " + precosComAcrescimo);

        sc.close();
    }
}
