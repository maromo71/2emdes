package net.maromo.view;

import net.maromo.dao.AlunoDao;
import net.maromo.model.Aluno;
import net.maromo.model.Curso;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

public class formAluno {
    private JTextField textRM;
    private JTextField textNome;
    private JTextField textEmail;
    private JTextField textTelefone;
    private JTextField textEndereco;
    private JComboBox comboCurso;
    private JButton gravarButton;
    private JButton sairButton;
    private JPanel alunoPanel;

    public formAluno() {
        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Aluno aluno = new Aluno();
                aluno.setRm(Integer.parseInt(textRM.getText()));
                aluno.setNome(textNome.getText());
                aluno.setEmail(textEmail.getText());
                aluno.setTelefone(textTelefone.getText());
                aluno.setEndereco(textEndereco.getText());
                Curso curso = Curso.emdes;
                switch (comboCurso.getSelectedIndex()){
                    case 0:
                        curso = Curso.emdes;
                        break;
                    case 1:
                        curso = Curso.emia;
                        break;
                    case 2:
                        curso = Curso.eminfo;
                        break;
                    case 3:
                        curso = Curso.emad;
                        break;
                }
                aluno.setCurso(curso);
                //Mudado aqui
                AlunoDao dao = new AlunoDao();
                try {
                    dao.inserirDado(aluno);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Erro \n" + ex.toString(),
                            "Erro ao Cadastrar Aluno",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }

                //mostrar como resultado os dados do aluno no objeto aluno.
                JOptionPane.showMessageDialog(
                        null,
                        "Dados do Aluno \n" + aluno.toString(),
                        "Cadastro efetuado com sucesso",
                        JOptionPane.INFORMATION_MESSAGE
                );
                limparTela();
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                sairDoCadastro();
            }
        });
    }

    private void sairDoCadastro() {
        formMenu.telaAluno.dispose();
    }

    private void limparTela() {
        textEmail.setText("");
        textEndereco.setText("");
        textNome.setText("");
        textRM.setText("");
        textTelefone.setText("");
        comboCurso.setSelectedIndex(0);
    }

    public JPanel getAlunoPanel() {
        return alunoPanel;
    }
}
