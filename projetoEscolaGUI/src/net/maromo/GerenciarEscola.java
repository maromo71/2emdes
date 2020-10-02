package net.maromo;

import net.maromo.view.formMenu;

import javax.swing.*;
import java.awt.*;

public class GerenciarEscola {

    public static void main(String[] args) {
        //Chamar a tela a de entrada do programa
        //ou seja, o formulário (formMenu)
        JFrame telaPrincipal = new JFrame("Sistema de Gerenciamento da Etec");
        telaPrincipal.setContentPane(new formMenu().getMenuPanel());
        telaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        telaPrincipal.setExtendedState(Frame.MAXIMIZED_BOTH);
        telaPrincipal.pack();
        telaPrincipal.setVisible(true);
    }
}
