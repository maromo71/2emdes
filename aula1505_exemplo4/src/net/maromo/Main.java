package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    //Este programa pede um número para o usuário, e só da continuidade quando for impar
        int n;
        do{
            System.out.println("Digite um número ímpar: ");
            n = Integer.parseInt(sc.nextLine());
        }while(n % 2 ==0);

        System.out.println("Número válido: " + n);
    }
}
