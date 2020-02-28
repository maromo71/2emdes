package net.maromo;

public class Main {

    public static void main(String[] args) {
	    int compra = 15;
	    String mensagem;
	    mensagem = "Comprei ";
	    String produto = " coca-cola(s)";
	    String strCompra = Integer.toString(compra);
	    mensagem += strCompra + produto;
        System.out.println(mensagem);
        float resultado =  (float) 10/3; //cast
		System.out.println(resultado);

    }
}
