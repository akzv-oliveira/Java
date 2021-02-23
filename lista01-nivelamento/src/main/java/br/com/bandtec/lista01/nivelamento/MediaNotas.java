package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitorTexto = new Scanner (System.in);

        System.out.println("Digite o seu nome:");
        String nome = leitorTexto.nextLine();

        System.out.println("\nDigite sua 1° nota");
        Double primeiraNota = leitorNumero.nextDouble();

        System.out.println("\nDigite sua 2° nota");
        Double segundaNota = leitorNumero.nextDouble();

        Double media = (primeiraNota + segundaNota) / 2;
        System.out.println(String.format("\nOlá, %s. Sua média foi de %.1f", nome, media));
    }
}
