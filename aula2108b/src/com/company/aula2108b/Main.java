package com.company.aula2108b;

public class Main {

    public static void main(String[] args) {
	    int x, y, z;
	    x = 10;
	    y = 50;
	    z = 100;
        System.out.println("Somando: " + somar(10));
        System.out.println("Somando: " + somar(x, y));
        System.out.println("Somando: " + somar(x, y, z));
        System.out.println("Somando: " + somar(1, 2, 3));

        System.out.println("Valor do PI: " + Math.PI);
    }

    public static int somar(int a){
        return a + 30;
    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int somar(int a, int b, int c){
        return a + b + c;
    }
}
