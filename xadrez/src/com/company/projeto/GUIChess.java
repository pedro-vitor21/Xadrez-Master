package com.company.projeto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIChess extends JFrame {
    private JPanel boardPanel;
    private JButton[][] squares;

    public GUIChess() {
        setTitle("Xadrez");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initializeBoard();

        setVisible(true);
    }

    private void initializeBoard() {
        boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(8, 8));
        squares = new JButton[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton button = new JButton();
                // Define as dimensões do botão
                button.setPreferredSize(new Dimension(60, 60));

                // Define a cor de fundo do botão de acordo com a posição no tabuleiro
                if ((i + j) % 2 == 0) {
                    button.setBackground(Color.WHITE);
                } else {
                    button.setBackground(Color.GRAY);
                }

                // Adiciona um nome ao botão para identificar sua posição no tabuleiro
                button.setName("(" + i + ", " + j + ")");

                // Adiciona um ActionListener para manipular os cliques nos botões
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Aqui você pode adicionar a lógica para manipular os cliques nos botões do tabuleiro
                        JButton clickedButton = (JButton) e.getSource();
                        // Por exemplo, exibir as informações da peça clicada
                        System.out.println("Informações da peça: " + clickedButton.getText());
                    }
                });

                // Adiciona o botão ao array de botões do tabuleiro
                squares[i][j] = button;

                // Adiciona o botão ao painel do tabuleiro
                boardPanel.add(button);
            }
        }
        add(boardPanel);

        // Adiciona as peças ao tabuleiro
        adicionarPecas();
    }

    private void adicionarPecas() {
        // Peças brancas
        // Peões brancos
        for (int j = 0; j < 8; j++) {
            squares[1][j].setText("Peão Branco");
        }
        // Outras peças brancas
        squares[0][0].setText("Torre Branca");
        squares[0][1].setText("Cavalo Branco");
        squares[0][2].setText("Bispo Branco");
        squares[0][3].setText("Rainha Branca");
        squares[0][4].setText("Rei Branco");
        squares[0][5].setText("Bispo Branco");
        squares[0][6].setText("Cavalo Branco");
        squares[0][7].setText("Torre Branca");

        // Peças pretas
        // Peões pretos
        for (int j = 0; j < 8; j++) {
            squares[6][j].setText("Peão Preto");
        }
        // Outras peças pretas
        squares[7][0].setText("Torre Preta");
        squares[7][1].setText("Cavalo Preto");
        squares[7][2].setText("Bispo Preto");
        squares[7][3].setText("Rainha Preta");
        squares[7][4].setText("Rei Preto");
        squares[7][5].setText("Bispo Preto");
        squares[7][6].setText("Cavalo Preto");
        squares[7][7].setText("Torre Preta");
    }

    public static void main(String[] args) {
        new GUIChess();
    }
}
