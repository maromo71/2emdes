package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    char letra;
	    int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor para x");
        x = sc.nextInt();
        System.out.println("Digite uma letra: ");
        letra = sc.next().charAt(0); //cast
        System.out.println("Digite um valor para y");
        y = sc.nextInt();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("letra = " + letra);
    }
}
