package com.company.aula2108c.visao;

import com.company.aula2108c.modelo.Aluno;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AlunoVisao {
    private JTextField txtRM;
    private JTextField txtNome;
    private JTextField txtEmail;
    private JButton mostrarButton;
    private JPanel telaAluno;

    public AlunoVisao() {
        mostrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Aluno aluno = new Aluno(
                        Integer.parseInt(txtRM.getText())
                        , txtNome.getText(),
                        txtEmail.getText());
                JOptionPane.showMessageDialog(null,
                        "Mensagem: Cadastro efetuado",
                        "Cadastro",
                        JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,
                        "Aluno: " + aluno.toString(),
                        "Dados",
                        JOptionPane.INFORMATION_MESSAGE);
                txtRM.setText(null);
                txtEmail.setText(null);
                txtNome.setText(null);
                txtRM.requestFocus();
            }
        });
    }

    public JPanel getTelaAluno() {
        return telaAluno;
    }

    public void setTelaAluno(JPanel telaAluno) {
        this.telaAluno = telaAluno;
    }
}
