package net.maromo;

public class Conta {
    //Atributos
    private int numConta;
    private String cliente;
    private double saldo;

    //Método construtor de objeto
    public Conta(){
        System.out.println("Criei o objeto conta...");
    }

    //metodos getters and setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    //métodos da classe
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    public boolean depositar(double valor){
        if(valor > 0 ){
            saldo = saldo + valor;
            return true;
        }
        return false;
    }
    public void imprimirExtrato(){
        System.out.println("numConta = " + numConta);
        System.out.println("cliente = " + cliente);
        System.out.println("saldo = " + saldo);
        System.out.println();
    }
}
