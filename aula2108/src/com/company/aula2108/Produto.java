package com.company.aula2108;

public class Produto {
    //atributos
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;
    private int quantidade;

    //método construtor (contrutor numero 1)
    public Produto(int codigo, String nome, double valor, boolean disponivel, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.disponivel = disponivel;
        this.quantidade = quantidade;
    }
    //método construtor (construtor numero 2)
    public Produto(){

    }


    //métodos gets \ sets


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


   
}
