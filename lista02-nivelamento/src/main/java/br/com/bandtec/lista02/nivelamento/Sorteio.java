package br.com.bandtec.lista02.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 100:");
        Integer numero = leitor.nextInt();

        Integer contador = 0;
        Integer contadorPar = 0;
        Integer contadorImpar = 0;
        Integer i = 1;

        while (i <= 200) {
            Integer sorteio = ThreadLocalRandom.current().nextInt(1, 100);
            System.out.println(sorteio);
            i++;

            if (numero.equals(sorteio)) {
                contador++;
                if (contador == 1) {
                    System.out.println(String.format("O seu número foi sorteado pela primeira vez"
                            + " na posição %d", i));
                }
            }

            if (sorteio % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
        }

        if (contador == 0) {
            System.out.println("\nSeu número não foi sorteado!");
        }

        System.out.println(String.format("\nTotal de n° pares: %d", contadorPar));
        System.out.println(String.format("Total de n° impares: %d", contadorImpar));

    }
}
