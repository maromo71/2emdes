package net.maromo;

import java.util.Scanner;

public class GerenciarContas {

    public Conta conta1 = new Conta();

    public static void main(String[] args) {
        //1. Entrada do programa
        Scanner sc = new Scanner(System.in);
        GerenciarContas gc = new GerenciarContas();
        int opc=0;
        do{
            //Construir o menu
            System.out.println("MENU BANCARIO");
            System.out.println("1.. Cadastrar Conta");
            System.out.println("2.. Depositar");
            System.out.println("3.. Sacar");
            System.out.println("4.. Ver Saldo");
            System.out.println("5.. Imprimir Extrato");
            System.out.println("9.. Sair");
            System.out.println("Digite sua opção: ");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    gc.cadastrarConta();
                    break;
                case 2:
                    gc.efetuarDeposito();
                    break;
                case 3:
                    gc.efetuarSaque();
                    break;
                case 4:
                    System.out.println(gc.conta1.verSaldo());
                    break;
                case 5:
                    gc.conta1.imprimirExtrato();
                    break;
                case 9:
                    System.out.println("FIM");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opc!=9);



    }
    public void cadastrarConta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta: ");
        conta1.numero = Integer.parseInt(sc.nextLine());
        System.out.println("Digite o titula da conta: ");
        conta1.titular = sc.nextLine();
    }

    public void efetuarDeposito(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito: ");
        double valorDeposito = Double.parseDouble(sc.nextLine());
        boolean depositou = conta1.depositar(valorDeposito);
        if(depositou){
            System.out.println("Deposito efetuado com sucesso");
        }else{
            System.out.println("Valor de deposito invalido");
        }
    }

    public void efetuarSaque(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque: ");
        double valorSaque = Double.parseDouble(sc.nextLine());
        boolean sacou = conta1.sacar(valorSaque);
        if(sacou){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}
