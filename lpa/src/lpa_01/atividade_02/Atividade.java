package lpa_01.atividade_02;

import java.util.Scanner;

/**
 * Missao: Imprimir a discografia do Led Zeppelin na tela
 * O usuario devera informar o nome da banda como led
 * Caso outro valor seja informado, o programa devera informar ao usuario
 * que ele nao inseriu o nome da banda
 * Utilize uma estrutura de repeticao para imprimir o nome dos quatro primeiros discos
 */
//Classe eh o elemento principal de um programa java e SEMPRE deve iniciar com letra maiuscula
public class Atividade {
    //Main eh o método principal de um programa Java
    public static void main (String args[]) {
        //Scanner eh uma classe utilizada para habilitar entrada de dados no programa
        Scanner in = new Scanner(System.in);

        //Leitura de dados inseridos
        String banda = in.next();

        //Impressao em tela
        System.out.println("Iniciando o programa\n");

        /*
            Discografia do Led Zeppelin
            Os quatro primeiros discos sao nomeados seguindo uma sequencia numerica
            Utilize um loop para mostra-los e escrever menos codigo :)
            Para facilitar a vida de voces, podem imprimir com numeros 1, 2, 3 e 4
            Quem imprimir utilizando algarismos romanos ganha pontuacao extra
                Led Zeppelin I
                Led Zeppelin II
                Led Zeppelin III
                Led Zeppelin IV
            Houses of The Holly
            Physical Grafitti
            Presence
            In Through The Out Door
            Coda
        */

        System.out.println("\nFim do programa");
    }
}
