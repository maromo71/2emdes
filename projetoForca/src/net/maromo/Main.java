package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando jogo da forca...");
        System.out.println("Palavra a ser descoberta");
        Forca jogo = new Forca();

        while(true){
            System.out.println("Digite uma letra a ser encontrada: ");
            String letra = sc.nextLine().toUpperCase();
            jogo.jogar(letra.charAt(0));
            System.out.println("----------------------------------------");
        }

    }
}
