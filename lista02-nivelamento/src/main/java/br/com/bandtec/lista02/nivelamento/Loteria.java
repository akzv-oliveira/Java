package br.com.bandtec.lista02.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 0 e 10:");
        Integer numero = leitor.nextInt();
        Integer sorteio = ThreadLocalRandom.current().nextInt(0, 10);
        Integer tentativas = 0;

        while (sorteio != numero) {
            System.out.println("\nVocê errou o sorteio,\ndigite um número entre 0 e 10 novamente:");
            numero = leitor.nextInt();
            tentativas++;
        }

        if (tentativas <= 3) {
            System.out.println("\nVocê é MUITO sortudo");
            System.out.println(String.format("Resultado do Sorteio: %d", sorteio));
            System.out.println(String.format("Número de tentativas: %d", tentativas));
        } else if (tentativas >= 4 && tentativas <= 10) {
            System.out.println("\nVocê é sortudo");
            System.out.println(String.format("Resultado do Sorteio: %d", sorteio));
            System.out.println(String.format("Número de tentativas: %d", tentativas));
        } else {
            System.out.println("\nÉ melhor você parar de apostar e ir trabalhar");
            System.out.println(String.format("Resultado do Sorteio: %d", sorteio));
            System.out.println(String.format("Número de tentativas: %d", tentativas));
        }
    }
}
