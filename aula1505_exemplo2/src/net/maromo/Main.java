package net.maromo;

public class Main {

    public static void main(String[] args) {
	    //contagem0
        //atalho do teclado intellij (fori)
        //for crescente e com forçar saída
        int soma=0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
            System.out.println("Valor de i: " + i);
            if(soma > 15) break;
        }
        System.out.println("Parei com soma em: " + soma);
        //for decrescente
        for (int i = 10; i >=0 ; i--) {
            System.out.println(i);
        }
        //for que avança de dois em dois
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

        //for que faz contagem de 1 a 200, porém não mostra
        //os números diviseis por 3 (números módulos de tres)
        for (int i = 1; i < 200; i++) {
            if(i % 3 == 0) continue;
            System.out.println(i);
        }

    }
}
