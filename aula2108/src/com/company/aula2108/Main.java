package com.company.aula2108;

public class Main {

    public static void main(String[] args) {
        //objeto instanciado pelo construtor 1
        Produto prod1 = new Produto(1, "coca-cola",200.99, true, 10 );

        //objeto instanciado pelo construtor 2
        Produto prod2 = new Produto();
        prod2.setCodigo(2);
        prod2.setNome("Fanta");
        prod2.setDisponivel(true);
        prod2.setValor(300.88);
        prod2.setQuantidade(10);

        System.out.println("Empresa dos Produtos: ");


    }
}
