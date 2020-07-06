package net.maromo;

public class Circulo {
    private double raio;
    private String nome;
    //<alt> + <insert>


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        // valor do pi multiplicado por raio ao quadrado
        return Math.PI * Math.pow(raio, 2.0);
    }
}
