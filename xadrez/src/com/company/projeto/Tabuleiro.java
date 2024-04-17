package com.company.projeto;

import java.io.Serializable;

public class Tabuleiro implements Serializable {
    private Peca[][] pecas;

    public Tabuleiro() {
        this.pecas = new Peca[8][8];
        // Inicialize o tabuleiro com as peças na posição inicial
    }

    // Métodos para manipular as peças no tabuleiro, como mover uma peça, verificar se há uma peça em uma determinada posição, etc.
}
