package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String nome, invertido = "";
	    //Para a entrada usamos Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do cara: ");
        nome = input.nextLine();
        System.out.println("Nome digitado: " + nome);
        int fim, tam;
        tam = nome.length(); //Retornar o tamanho
        fim = tam - 1;
        for (int i = fim; i >= 0; i--) {
            invertido += nome.charAt(i);
        }
        System.out.println("Nome invertido: " + invertido);
    }
}
