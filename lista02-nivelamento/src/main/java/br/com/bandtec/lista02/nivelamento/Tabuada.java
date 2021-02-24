package br.com.bandtec.lista02.nivelamento;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Integer numero = leitor.nextInt();

        System.out.println(String.format("\nTabuada do %d", numero));

        for (int i = 0; i <= 10; i++) {
            Integer resultado = numero * i;
            System.out.println(String.format("%d x %d = %d", numero, i, resultado));
        }
    }
}
