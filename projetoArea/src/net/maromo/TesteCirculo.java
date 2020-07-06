package net.maromo;

import java.util.Scanner;

public class TesteCirculo {

    public static void main(String[] args) {
	    //Definir um circulo
        Circulo bola = new Circulo();
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do raio da bola: ");
        bola.setRaio(Double.parseDouble(leitor.nextLine()));
        //Resultado da operacao
        System.out.println("O valor da área da circunferência é: " + bola.calcularArea());
    }
}
