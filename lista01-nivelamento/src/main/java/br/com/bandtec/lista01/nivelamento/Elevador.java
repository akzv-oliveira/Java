package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o limite peso (kg) de um elevador:");
        Double peso = leitor.nextDouble();

        System.out.println("\nDigite o limite de pessoas em um elevador:");
        Integer pessoas = leitor.nextInt();

        System.out.println("\nDigite o peso (kg) da 1° pessoa a entrar no elevador:");
        Double pesoPrimeiraPessoa = leitor.nextDouble();

        System.out.println("\nDigite o peso (kg) da 2° pessoa a entrar no elevador:");
        Double pesoSegundaPessoa = leitor.nextDouble();

        System.out.println("\nDigite o peso (kg) da 3° pessoa a entrar no elevador:");
        Double pesoTerceiraPessoa = leitor.nextDouble();

        Double pesoTotal = pesoPrimeiraPessoa + pesoSegundaPessoa + pesoTerceiraPessoa;

        System.out.println(String.format("\nEntraram 3 pessoas no elevador, no qual cabem %d pessoas."
                + "\nO peso total no elevador é de %.2f kg sendo que ele suporta %.2f kg", pessoas, pesoTotal, peso));
    }
}
