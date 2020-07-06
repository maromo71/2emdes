package net.maromo;

import java.util.Scanner;

public class TesteImc {

    public static void main(String[] args) {
	// write your code here
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        pessoa.setNome(sc.nextLine());
        System.out.println("Digite o peso do(a) " + pessoa.getNome());
        pessoa.setPeso(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a altura do(a) " + pessoa.getNome());
        pessoa.setAltura(Double.parseDouble(sc.nextLine()));
        //Apresentar como resultado o IMC desta pessoa
        System.out.println("O Imc do(a) " + pessoa.getNome() + " é : " + pessoa.getImc());

    }
}
