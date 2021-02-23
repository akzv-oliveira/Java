package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class CalculadoraCalorias {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Seja bem vindo Jorge!");
        System.out.println("\nDigite o tempo, em minutos, em que você passou"
                + " se aquecendo:");
        Integer tempoAquecimento = leitor.nextInt();

        System.out.println("\nDigite o tempo, em minutos, em que você fez"
                + " exercícios aeróbicos:");
        Integer tempoAerobico = leitor.nextInt();

        System.out.println("\nDigite o tempo, em minutos, em que você fez "
                + "exercícios de musculação:");
        Integer tempoMusculacao = leitor.nextInt();

        Integer caloriasPerdidasAquecimento = tempoAquecimento * 12;
        Integer caloriasPerdidasAerobico = tempoAerobico * 20;
        Integer caloriasPerdidasMusculacao = tempoMusculacao * 25;

        Integer tempoTotal = tempoAquecimento + tempoAerobico + tempoMusculacao;
        Integer caloriasPerdidasTotal = caloriasPerdidasAquecimento + caloriasPerdidasAerobico + caloriasPerdidasMusculacao;

        System.out.println(String.format("\nOlá, Jorge. Você fez um total de %d minutos de"
                + " exercícios e perdeu cerca de %d calorias.", tempoTotal, caloriasPerdidasTotal));

    }
}
