package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String nome = "Etec";
	    int valor = 60;
	    int qtdDeFilhos;
	    String nomeUsuario;
	    Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nomeUsuario = sc.nextLine();
        System.out.println("Digite a qtd de filhos");
        qtdDeFilhos = Integer.parseInt(sc.nextLine());
        float total = qtdDeFilhos * valor;
        System.out.println("Valor a pagar: " + total);
        System.out.println("APM agradece");
    }
}
