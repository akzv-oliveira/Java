package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();

        System.out.println(String.format("\nOlá %s! Qual o ano de seu nascimento?", nome));
        Integer anoNascimento = leitor.nextInt();

        Integer idadePrevista = 2030 - anoNascimento;

        System.out.println(String.format("\nEm 2030 você terá %d anos", idadePrevista));
    }
}
