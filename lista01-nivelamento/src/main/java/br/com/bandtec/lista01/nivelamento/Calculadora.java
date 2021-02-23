package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Double primeiroNumero = leitor.nextDouble();

        System.out.println("Digite outro número:");
        Double segundoNumero = leitor.nextDouble();

        Double soma = primeiroNumero + segundoNumero;
        Double subtracao = primeiroNumero - segundoNumero;
        Double multiplicacao = primeiroNumero * segundoNumero;
        Double divisao = primeiroNumero / segundoNumero;

        System.out.println(String.format("\nResultado da soma:\n%.1f", soma));
        System.out.println(String.format("Resultado da subtração:\n%.1f", subtracao));
        System.out.println(String.format("Resutlado da multiplicação:\n%.1f", multiplicacao));
        System.out.println(String.format("Resultado da divisão:\n%.1f", divisao));
    }
}
