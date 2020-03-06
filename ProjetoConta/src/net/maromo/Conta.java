package net.maromo;

public class Conta {
    //1. Definir atributos
    public int numero;
    public String titular;
    public double saldo;

    //2. Definir os métodos
    public boolean depositar(double valor){
        if(valor > 0){
            saldo+= valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo-= valor; // saldo - valor
            return true;
        }
        return false;
    }
    public double verSaldo(){
        return saldo;
    }
    public void imprimirExtrato(){
        System.out.println("Imprimir Extrato");
        System.out.println("numero = " + numero);
        System.out.println("titular = " + titular);
        System.out.println("saldo = " + saldo);
        System.out.println("--------------------");
    }
}
