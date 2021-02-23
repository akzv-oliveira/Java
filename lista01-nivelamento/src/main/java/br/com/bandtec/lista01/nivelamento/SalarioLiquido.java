package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o salário bruto:");
        Double salarioBruto = leitor.nextDouble();

        Double inss = salarioBruto * 0.10;
        Double impostoRenda = salarioBruto * 0.20;

        System.out.println("\nQuanto custa a condução diária só de ida da casa"
                + " para o trabalho?");
        Double conducaoDiaria = leitor.nextDouble();

        Double valeTransporte = (conducaoDiaria * 2) * 22;

        Double totalDesconto = inss + impostoRenda + valeTransporte;
        Double salarioLiquido = salarioBruto - totalDesconto;

        System.out.println(String.format("\nSeu bruto é R$ %.2f, tem um total de R$%.2f"
                + " em descontos e receberá um líquido de R$%.2f", salarioBruto,
                totalDesconto, salarioLiquido));

    }
}
