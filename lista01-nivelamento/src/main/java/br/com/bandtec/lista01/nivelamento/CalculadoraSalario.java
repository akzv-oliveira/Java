package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salário:");
        Double salario = leitor.nextDouble();

        System.out.println("\nDigite a % de imposto que deve pagar");
        Double imposto = leitor.nextDouble();

        Double desconto = salario * (imposto / 100);
        Double salarioLiquido = salario - desconto;

        System.out.println(String.format("\nO valor do seu salário líquido é R$%.2f", salarioLiquido));
    }
}
