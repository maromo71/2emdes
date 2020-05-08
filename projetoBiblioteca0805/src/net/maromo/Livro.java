package net.maromo;

public class Livro {
    //atributos
    private int isbn;
    private String titulo;
    private int anoLancamento;
    private double valor;
    private int qtd;

    //métodos getters and setters
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void comprar(int qtdComprada){
        this.qtd = this.qtd + qtdComprada;
    }
    public void vender(int qtdVedida){
        this.qtd = this.qtd -qtdVedida;
    }

    public void imprimir(){
        System.out.println("isbn = " + isbn);
        System.out.println("titulo = " + titulo);
        System.out.println("anoLancamento = " + anoLancamento);
        System.out.println("valor = " + valor);
        System.out.println("Quantidade em Estoque = " + qtd);
    }
}
