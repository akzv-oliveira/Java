package br.com.bandtec.vinicius.oliveira.ac1;

import java.util.Scanner;

public class MouseClub {

    public static void main(String[] args) {
        // VERSÃO DO NETBEANS: 12.2
        Scanner leitorTexto = new Scanner(System.in);
        Scanner leitorNumero = new Scanner(System.in);

        Boolean isNotGamer = true;

        System.out.println("Seja bem vindo ao Mouse Club!");

        exibirLinha();

        System.out.println("Mouse Club é uma iniciativa que tem como objetivo"
                + " a interação\ne a aproximação do usuário com o seu mouse"
                + " por ele ser um dos recursos\nmais importantes que todo"
                + " usuário de computador possui. Vamos começar?");

        exibirLinha();

        System.out.println("Seu mouse possui um nome? Não? Antes de começarmos\n"
                + "que tal definirmos um nome para ele?\n"
                + "Digite o nome de seu Mouse:");
        String nomeMouse = leitorTexto.nextLine();
        System.out.println(String.format("\nMuito bem! O seu mouse agora se chama %s", nomeMouse));

        exibirLinha();

        System.out.println("Digite o modelo de seu Mouse:");
        String modeloMouse = leitorTexto.nextLine();
        System.out.println(String.format("\nLegal, o seu modelo é %s"
                + "\nvamos um pouco além agora...", modeloMouse));

        exibirLinha();

        System.out.println("Digite o DPI mínimo de seu Mouse: (valor mínimo a partir de 300)");
        Integer minDPI = leitorNumero.nextInt();
        for (int i = 0; i >= 0; i++) {
            if (minDPI < 300 || minDPI > 4000) {
                System.out.println("Formato inválido, digite novamente:");
                minDPI = leitorNumero.nextInt();
            }
        }

        System.out.println("\nDigite o DPI máximo de seu Mouse: (valor máximo até 4000)");
        Integer maxDPI = leitorNumero.nextInt();
        for (int i = 0; i >= 0; i++) {
            if (maxDPI < 300 || maxDPI > 4000) {
                System.out.println("Formato inválido, digite novamente:");
                maxDPI = leitorNumero.nextInt();
            }
        }

        System.out.println(String.format("\nO DPI mínimo de seu Mouse é %d, e o DPI máximo é %d", minDPI, maxDPI));
        validarDPI(minDPI, maxDPI);

        exibirLinha();

        System.out.println("Agora vamos fazer uma pequena simulação com seu mouse...");

        System.out.println("Digite a % de cliques que você realiza com seu mouse pela manhã: (0 à 100)");
        Double clickDia = leitorNumero.nextDouble();
        for (int i = 0; i >= 0; i++) {
            if (clickDia < 0 || clickDia > 100) {
                System.out.println("Formato inválido, digite novamente:");
                clickDia = leitorNumero.nextDouble();
            }
        }

        System.out.println("\nDigite a % de cliques que você realiza com seu mouse durante a tarde: (0 à 100)");
        Double clickTarde = leitorNumero.nextDouble();
        for (int i = 0; i >= 0; i++) {
            if (clickTarde < 0 || clickTarde > 100) {
                System.out.println("Formato inválido, digite novamente:");
                clickTarde = leitorNumero.nextDouble();
            }
        }

        System.out.println("\nDigite a % de cliques que você realiza com seu mouse durante a noite: (0 à 100)");
        Double clickNoite = leitorNumero.nextDouble();
        for (int i = 0; i >= 0; i++) {
            if (clickNoite < 0 || clickNoite > 100) {
                System.out.println("Formato inválido, digite novamente:");
                clickNoite = leitorNumero.nextDouble();
            }
        }

        Double exibirUso = exibirMedia(clickDia, clickTarde, clickNoite);

        System.out.println(String.format("\nA porcentagem média de cliques do"
                + " seu mouse durante um dia é de %.2f", exibirMedia(clickDia, clickTarde, clickNoite)));
        validarUso(exibirUso);

        exibirLinha();

        System.out.println("Agora vamos definir o tipo do seu Mouse baseado em seu preço!");
        System.out.println("Digite o preço (R$) que você pagou no seu mouse:");
        Double preco = leitorNumero.nextDouble();

        System.out.println(String.format("\nO seu mouse custa R$%.2f", preco));
        validarPreco(preco, isNotGamer);

        exibirLinha();

        System.out.println(String.format("Você e o mouse %s do modelo %s agora fazem parte do Mouse Club!"
                + " \nObrigado por fazer parte dessa iniciativa e nos dê um feedback sobre"
                + " sua experiência durante a aplicação:", nomeMouse, modeloMouse));
        String feedback = leitorTexto.nextLine();

        System.out.println(String.format("\nObrigado por contribuir com o feedback:\n%s\n"
                + "\nInteraja e convide mais membros para o nosso clube e "
                + "assim movimentarmos\nmais amor pela nossa querida ferramenta de "
                + "trabalho tão presente no nosso dia a dia.", feedback));

    }

    static void exibirLinha() {
        System.out.println("******************************************************************* ");
    }

    static Double exibirMedia(Double clickDia, Double clickTarde, Double clickNoite) {
        return ((clickDia + clickTarde + clickNoite) / 3);
    }

    static void validarUso(Double exibirUso) {
        if (exibirUso <= 30) {
            System.out.println("Você usa pouco o mouse durante o seu dia :c");
        } else if (exibirUso <= 50) {
            System.out.println("Você usa razoavelmente o seu mouse durante o dia");
        } else if (exibirUso <= 80) {
            System.out.println("Você usa bastante o seu mouse durante o dia :D");
        } else {
            System.out.println("Você é um verdadeiro maníaco do mouse :O");
        }
    }

    static void validarDPI(Integer minDPI, Integer maxDPI) {
        if (minDPI >= 300 && maxDPI <= 600) {
            System.out.println("O seu mouse é excelente para jogos do gênero FPS");
        } else if (minDPI >= 600 && maxDPI <= 1200) {
            System.out.println("O seu mouse é ótimo para jogos casuais");
        } else if (minDPI >= 1200 && maxDPI <= 1800) {
            System.out.println("O seu mouse é perfeito para jogos do gênero MOBA");
        } else {
            System.out.println("Impressionante! o seu mouse consegue se adaptar"
                    + " a mais de um gênero possível em jogos :D");
        }
    }

    static void validarPreco(Double preco, Boolean isNotGamer) {

        if (preco <= 20) {
            System.out.println("Mouse de Feira xD");
            isNotGamer = true;
        } else if (preco > 20 && preco < 50) {
            System.out.println("Mouse de Escritório :O");
            isNotGamer = true;
        } else if (preco >= 50 && preco < 100) {
            System.out.println("Parabéns, seu mouse é decente!");
            isNotGamer = true;
        } else if (preco >= 100 && preco <= 500) {
            System.out.println("Seu Mouse é Gamer :D");
            isNotGamer = false;
        } else if (preco > 500) {
            System.out.println("Mouse da NASA, só pode ser :/");
            isNotGamer = true;
        } else {
            System.out.println("Poxa, não conseguimos definir o tipo do seu mouse"
                    + " baseado em seu preço, mas vamos segui em frente :D");
            isNotGamer = true;
        }

        if (isNotGamer == false) {
            System.out.println("Eu te desafio para um x1 no Counter Strike :D");
        }
    }

}
