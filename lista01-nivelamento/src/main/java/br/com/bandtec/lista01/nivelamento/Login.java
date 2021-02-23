package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner leitorCaractere = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Digite seu login:");
        String login = leitorCaractere.nextLine();

        System.out.println("\nDigite sua senha:");
        String senha = leitorCaractere.nextLine();

        System.out.println("\nDigite a quantidade de vezes que você\naceita errar "
                + "a senha antes do bloqueio:");
        Integer tentativa = leitorNumero.nextInt();

        System.out.println(String.format("\nSeu login é %s e sua senha é %s."
                + "\nVocê tem %d  tentativas antes de ser bloqueado", login,
                senha, tentativa));
    }
}
