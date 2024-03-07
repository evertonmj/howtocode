package lpa_01.atividade_02;

import java.util.Scanner;

/**
 * Missao: Imprimir a discografia do Led Zeppelin na tela
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
