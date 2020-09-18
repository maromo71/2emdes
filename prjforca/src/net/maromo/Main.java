package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Forca f = new Forca();

        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println();
            System.out.println("Digite a letra para tentar advinhar: ");
            String l = sc.nextLine();
            f.jogar(l.charAt(0));
            System.out.println();

        }
    }
}
