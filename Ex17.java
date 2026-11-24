/*
 * Exercicio 17 - Optional (Java 8+):
 * Evita NullPointerException utilizando a classe Optional.
 */

import java.util.Optional;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um apelido (ou pressione ENTER para deixar vazio): ");
        String entrada = sc.nextLine();

        Optional<String> apelidoOptional;
        if (entrada.trim().isEmpty()) {
            apelidoOptional = Optional.empty();
        } else {
            apelidoOptional = Optional.of(entrada);
        }

        String resultadoFinal = apelidoOptional.orElse("Usuario Anonimo");

        System.out.println("Apelido registrado: " + resultadoFinal);

        sc.close();
    }
}
