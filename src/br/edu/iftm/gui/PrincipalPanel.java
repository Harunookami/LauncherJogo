package br.edu.iftm.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPanel extends JPanel implements ActionListener {
    private JPanel telas;
    private CardLayout controleTela;

    public PrincipalPanel(JPanel telas) {
        this.telas = telas;
        this.controleTela = (CardLayout) telas.getLayout();
        JLabel mensagem = new JLabel("Conteúdo do Principal Panel");


        JButton botao = new JButton("Voltar");
        botao.addActionListener(this);


        this.add(botao);
        this.add(mensagem);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        controleTela.show(telas, "Tela login");
    }
}
