package net.maromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //somatoria de n valores dados pelo usuario
        //condição de parada: encerra o programa quando a soma for maior 100
        int n;
        int soma = 0;
        while(soma <= 100){
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um valor: ");
            n = Integer.parseInt(sc.nextLine());
            //soma += n; //soma = soma + n
        }
        System.out.println("Soma final: " + soma);

    }
}
