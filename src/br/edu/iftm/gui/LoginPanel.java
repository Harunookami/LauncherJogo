package br.edu.iftm.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel implements ActionListener {
    private JPanel telas;
    private CardLayout controleTela;

    public LoginPanel(JPanel telas) {
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();
        JLabel mensagem = new JLabel("Conteúdo do Login Panel");

        JButton botao = new JButton("Fazer login");
        botao.addActionListener(this);



        this.add(mensagem);
        this.add(botao);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controleTela.show(telas, "Tela principal");
    }
}
