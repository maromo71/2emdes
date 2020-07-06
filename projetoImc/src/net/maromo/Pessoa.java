package net.maromo;

public class Pessoa {
    private double peso;
    private double altura;
    private String nome;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método que retorna o IMC de uma pessoa
    public double getImc(){
        return peso / Math.pow(altura, 2.0);
    }
}
