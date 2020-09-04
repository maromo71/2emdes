package net.maromo.prjveia;

import net.maromo.prjveia.view.FrmVeia;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Jogo da Véia");
        //anotem a linha abaixo
        tela.setContentPane(new FrmVeia().getPanelVeia());
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.pack();
        tela.setVisible(true);
    }
}
