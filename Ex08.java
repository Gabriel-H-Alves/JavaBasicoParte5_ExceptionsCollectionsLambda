/*
 * Exercicio 08 - HashSet (elementos unicos):
 * Adiciona identificadores de alunos garantindo que duplicados sejam ignorados.
 */

import java.util.HashSet;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> matriculas = new HashSet<>();

        System.out.println("Digite 5 matriculas (podem haver repeticoes):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Matricula " + (i + 1) + ": ");
            int matricula = sc.nextInt();
            matriculas.add(matricula);
        }

        System.out.println("Matriculas unicas cadastradas: " + matriculas);
        System.out.println("Total de matriculas unicas: " + matriculas.size());

        sc.close();
    }
}
