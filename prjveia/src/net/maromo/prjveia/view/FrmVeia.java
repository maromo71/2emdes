package net.maromo.prjveia.view;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmVeia {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonNew;
    private JButton buttonExit;
    private JPanel panelVeia;

    public JPanel getPanelVeia(){
        return panelVeia;
    }

    public static int jogada = 0;

    public FrmVeia() {
        buttonExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        buttonNew.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clearButtons();
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button1);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button2);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button3);
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button4);
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button5);
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button6);
            }
        });
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button7);
            }
        });
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button8);
            }
        });
        button9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                playNow(button9);
            }
        });
        panelVeia.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {

            }
        });
    }

    private void playNow(JButton button) {
        if(button.getText()!="") {
            JOptionPane.showMessageDialog(
                    null,
                    "Local já foi jogado",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
            return; //Não continua.
        }
        FrmVeia.jogada++;

        //Jogador X (jogada ímpar), Jogador 0 (jogadar 0)

        if(FrmVeia.jogada % 2 ==0){
            //jogador 0
            button.setText("0");
        }else{
            //jogador x
            button.setText("X");
        }
        //criar um rotina para ver se há vencedor.
        verifyGame();
    }

    private void verifyGame() {
        //checar as coordenadas para o jogador X e para o Jogador Y.
        boolean x = verify("X");
        boolean y = verify("0");
        //se o x venceu
        if(x){
            showMessage("X");
            clearButtons();
        }
        if(y){
            showMessage("0");
            clearButtons();
        }
        if(FrmVeia.jogada==9){
            JOptionPane.showMessageDialog(null,
                    "Deu empate",
                    "Empate",
                    JOptionPane.INFORMATION_MESSAGE);
            clearButtons();
        }
    }

    private boolean verify(String jog) {
        //horizontal
        if((button1.getText()==jog) && (button2.getText()==jog) && (button3.getText()==jog)){
            return true;
        }
        if((button4.getText()==jog) && (button5.getText()==jog) && (button6.getText()==jog)){
            return true;
        }
        if((button7.getText()==jog) && (button8.getText()==jog) && (button9.getText()==jog)){
            return true;
        }
        //vertical
        if((button1.getText()==jog) && (button4.getText()==jog) && (button7.getText()==jog)){
            return true;
        }
        if((button2.getText()==jog) && (button5.getText()==jog) && (button8.getText()==jog)){
            return true;
        }
        if((button3.getText()==jog) && (button6.getText()==jog) && (button9.getText()==jog)){
            return true;
        }
        //diagonais
        if((button1.getText()==jog) && (button5.getText()==jog) && (button9.getText()==jog)){
            return true;
        }
        if((button7.getText()==jog) && (button5.getText()==jog) && (button3.getText()==jog)){
            return true;
        }
        return false;
    }

    private void showMessage(String jog) {
        JOptionPane.showMessageDialog(
                null,
                "Jogador " + jog + " venceu a partida",
                "Vencedor",
                JOptionPane.INFORMATION_MESSAGE
        );
    }


    private void clearButtons() {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        FrmVeia.jogada = 0;
    }
}
