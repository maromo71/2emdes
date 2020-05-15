package net.maromo;

public class GerenciarLivros {

    public static void main(String[] args) {

        for(int i =0;i<5 && (i%2)==0;i++) System.out.print(" " + i++);
	    //Cadastrar dois tipos de livros e comprar 10 volumes de cada
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        //Entrada manual dos livros - simulacao
        livro1.setIsbn(1);
        livro1.setTitulo("Meu pé de laranja lima");
        livro1.setValor(15.0);
        livro1.setAnoLancamento(1999);
        //compra de 10 exemplares
        livro1.comprar(10);
        livro1.vender(3);
        //imprimir os dados do primeiro livro
        livro1.imprimir();

        //Repete para o segundo o livro
        livro2.setIsbn(2);
        livro2.setTitulo("Batman o Retorno");
        livro2.setAnoLancamento(2005);
        livro2.setValor(22.99);
        livro2.comprar(10);
        livro2.vender(5);
        livro2.imprimir();

    }
}
