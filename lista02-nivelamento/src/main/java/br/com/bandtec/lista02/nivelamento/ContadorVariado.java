package br.com.bandtec.lista02.nivelamento;

public class ContadorVariado {

    public static void main(String[] args) {
        for (double i = 0.15; i < 5; i += 0.15) {
            System.out.println(String.format("%.2f", i));
        }
    }
}
