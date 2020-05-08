package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //Variáveis locais e o usuário dando a entrada de dados
        //Classe para leitura de buffers (Scanner)
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Valor de A: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println("Valor de B: ");
        b = Integer.parseInt(scanner.nextLine());
        int c = a + b;
        System.out.println("Soma dos valores: " + c);
    }
}
