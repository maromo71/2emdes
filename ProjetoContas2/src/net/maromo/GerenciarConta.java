package net.maromo;

import java.util.Scanner;

public class GerenciarConta {

    //Atributo
    public Conta conta;
    //Construtor
    public GerenciarConta(){
        conta = new Conta();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarConta gerenciar = new GerenciarConta();
	    int opc=0;
	    do{
            System.out.println("1.. Cadastrar a conta");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Imprimir extrato");
            System.out.println("9.. Finalizar");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execDepositar();
                    break;
                case 3:
                    gerenciar.execSacar();
                    break;
                case 4:
                    gerenciar.execConsultar();
                    break;
                case 9:
                    System.out.println("Fim");
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        }while(opc!=9);
   }

    private void execConsultar() {
        conta.imprimirExtrato();
    }

    private void execSacar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        if(conta.sacar(Double.parseDouble(sc.nextLine()))){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Não tem saldo suficiente");
        }
    }
    private void execDepositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        if(conta.depositar(Double.parseDouble(sc.nextLine()))){
            System.out.println("Deposito efetuado com sucesso");
        }else{
            System.out.println("Valor invalido para deposito");
        }
    }

    private void execCadastrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        conta.setNumConta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do cliente: ");
        conta.setCliente(sc.nextLine());
        System.out.println("Cliente cadastrado com sucesso");
    }
}
