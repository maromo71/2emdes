package net.maromo;

public class CD {
    private int numero;
    private String titulo;
    private String artista;
    private double valor;
    private int ano;
    //criei depois e não fiz um get e set para ele
    private boolean disponivel;

    //para gerar usamos a tecla <ALT> + <insert>
    //getter setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void cadastrarDisponibilidade(boolean valor){
        if(valor==true) {
            disponivel = true;
            System.out.println("Cadastrado como disponível");
        }else{
            disponivel = false;
            System.out.println("CD cadastrado, mas não está disponível");
        }
    }
    public void imprimir(){
        System.out.println("numero = " + numero);
        System.out.println("titulo = " + titulo);
        System.out.println("artista = " + artista);
        System.out.println("valor = " + valor);
        System.out.println("ano = " + ano);
        if(disponivel){
            System.out.println("Está disponível na minha CDteca");
        }else{
            System.out.println("Não está disponível na CDteca");
        }
    }
}
