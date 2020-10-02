package net.maromo.view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formMenu {
    private JButton alunoButton;
    private JButton sairButton;
    private JButton disciplinasButton;
    private JButton professorButton;
    private JPanel menuPanel;
    public static JFrame telaAluno;

    public JPanel getMenuPanel() {
        return menuPanel;
    }

    public formMenu() {
        alunoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                telaAluno = new JFrame("Cadastro de Alunos");
                telaAluno.setContentPane(new formAluno().getAlunoPanel());
                telaAluno.setSize(500,500);
                telaAluno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                telaAluno.setVisible(true);

            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
    }
}
