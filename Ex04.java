/*
 * Exercicio 04 - Excecao Customizada (Checked Exception):
 * Cria SaldoInsuficienteException herdando de Exception e lanca com throw.
 */

import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoDisponivel = 500.0;

        try {
            System.out.print("Digite o valor para sacar (Saldo R$ 500.0): ");
            double valorSaque = sc.nextDouble();

            efetuarSaque(saldoDisponivel, valorSaque);
            System.out.println("Saque aprovado com sucesso!");
        } catch (SaldoInsuficienteException erro) {
            System.out.println("Falha na operacao: " + erro.getMessage());
        }

        sc.close();
    }

    public static void efetuarSaque(double saldo, double saque) throws SaldoInsuficienteException {
        if (saque > saldo) {
            throw new SaldoInsuficienteException("Valor de saque maior que o saldo disponivel.");
        }
    }
}
