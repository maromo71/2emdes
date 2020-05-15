package net.maromo;

import java.util.Scanner;

public class GerenciarCDs {

    public static void main(String[] args) {
	    CD cd1, cd2;
        cd1 = new CD();
        cd1.setNumero(1);
        cd1.setTitulo("Sertanejo +");
        cd1.setArtista("Michel Teló");
        cd1.setAno(2016);
        cd1.setValor(30);
        cd1.cadastrarDisponibilidade(false);
        System.out.println();
        cd1.imprimir();

        cd2 = new CD();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do CD");
        cd2.setNumero(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite o titulo do CD");
        cd2.setTitulo(scanner.nextLine());
        System.out.println("Digite o nome do artista do CD");
        cd2.setArtista(scanner.nextLine());
        System.out.println("Digite o ano de compra do CD");
        cd2.setAno(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite o valor do CD");
        cd2.setValor(Double.parseDouble(scanner.nextLine()));
        int opcao;
        System.out.println("Digite 1 para disponível ou 2 para indisponível.");
        opcao = Integer.parseInt(scanner.nextLine());
        switch (opcao){
            case 1:
                cd2.cadastrarDisponibilidade(true);
                break;
            case 2:
                cd2.cadastrarDisponibilidade(false);
                break;
            default:
                System.out.println("Você deve informar corretamente a disponibilidade");
                System.out.println("Sistema deixou como padrão: indisponibilidade ");
        }
        cd2.imprimir();
    }
}
