package com.company.aula2108c;

import com.company.aula2108c.visao.AlunoVisao;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Cadastro de Alunos");
        tela.setContentPane(new AlunoVisao().getTelaAluno());
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
