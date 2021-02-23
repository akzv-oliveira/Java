package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor unitário de um produto:");
        Double unitario = leitor.nextDouble();

        System.out.println("\nDigite a quantidade vendida:");
        Integer quantidadeVendida = leitor.nextInt();

        System.out.println("\nDigite o valor pago pelo cliente:");
        Double valorPago = leitor.nextDouble();

        Double troco = valorPago - (unitario * quantidadeVendida);

        System.out.println(String.format("\nSeu troco será de R$%.2f", troco));
    }
}
