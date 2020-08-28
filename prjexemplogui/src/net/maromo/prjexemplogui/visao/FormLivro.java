package net.maromo.prjexemplogui.visao;

import net.maromo.prjexemplogui.modelo.Livro;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormLivro {
    private JPanel panelLivros;
    private JTextField textISBN;
    private JTextField textTitulo;
    private JTextField textAutor;
    private JTextField textCategoria;
    private JTextField textPreco;
    private JButton buttonCadastrar;
    private JButton buttonLimpar;

    public FormLivro() {
        buttonCadastrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Livro livro = new Livro();
                livro.setISBN(Integer.parseInt(textISBN.getText()));
                livro.setTitulo(textTitulo.getText());
                livro.setAutor(textAutor.getText());
                livro.setCategoria(textCategoria.getText());
                livro.setPreco(Double.parseDouble(textPreco.getText()));
                JOptionPane.showMessageDialog(null,
                        "Cadastrado com sucesso",
                        "Cadastro OK",
                        JOptionPane.INFORMATION_MESSAGE);
                limpar();
                JOptionPane.showMessageDialog(null,
                        "Dados que foram cadastrados: \n" + livro.toString(),
                        "Cadastro OK",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });
        buttonLimpar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                limpar();
            }
        });
    }

    private void limpar() {
        textISBN.setText("");
        textAutor.setText("");
        textCategoria.setText("");
        textPreco.setText("");
        textTitulo.setText("");
        textISBN.requestFocus(); //coloca o foco do mouse na caixa de texto
    }

    public JPanel getPanelLivros() {
        return panelLivros;
    }
}
