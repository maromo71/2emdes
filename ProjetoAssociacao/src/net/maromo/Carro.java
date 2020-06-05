package net.maromo;

public class Carro {
    private String modelo;
    private String placa;
    private int ano;
    private double valor;

    //<alt> + <insert>

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirDadosCarro(){
        System.out.println("Dados do carro");
        System.out.println("------------------------------");
        System.out.println("modelo = " + modelo);
        System.out.println("placa = " + placa);
        System.out.println("ano = " + ano);
        System.out.println("valor = " + valor);
        System.out.println("------------------------------");
        System.out.println();
    }
}
