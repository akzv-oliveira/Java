package br.com.bandtec.lista01.nivelamento;

import java.util.Scanner;

public class BolsaFilhos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quantos filhos de 0 a 3 anos possui:");
        Integer primeiraFaixaEtaria = leitor.nextInt();

        System.out.println("\nDigite quantos filhos de 4 a 16 anos possui:");
        Integer segundaFaixaEtaria = leitor.nextInt();

        System.out.println("\nDigite quantos filhos de 17 a 18 anos possui:");
        Integer terceiraFaixaEtaria = leitor.nextInt();

        Double bolsaPrimeiraFaixaEtaria = primeiraFaixaEtaria * 25.12;
        Double bolsaSegundaFaixaEtaria = segundaFaixaEtaria * 15.88;
        Double bolsaTerceiraFaixaEtaria = terceiraFaixaEtaria * 12.44;
        Integer totalFilhos = primeiraFaixaEtaria + segundaFaixaEtaria + terceiraFaixaEtaria;
        Double totalBolsa = bolsaPrimeiraFaixaEtaria + bolsaSegundaFaixaEtaria + bolsaTerceiraFaixaEtaria;

        System.out.println(String.format("\nVocê tem um total de %d filhos"
                + " e vai receber R$%.2f de bolsa", totalFilhos, totalBolsa));
    }
}
