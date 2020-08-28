package net.maromo.prjexemplogui;

import net.maromo.prjexemplogui.visao.FormLivro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Cadastro de Livros");
        //anotem a linha abaixo
        tela.setContentPane(new FormLivro().getPanelLivros());
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
