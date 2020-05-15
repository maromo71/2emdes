package net.maromo;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Acampamento membro = new Acampamento();
        System.out.println("Digite o nome do membro do acampamento: ");
        membro.setNome(sc.nextLine());
        System.out.println("Digite a idade do membro: ");
        membro.setIdade(Integer.parseInt(sc.nextLine()));
        membro.imprimir();
        System.out.println("=================================");
        membro.separarGrupo();
        membro.imprimir();

    }
}
