package com.company.projeto;

public interface XadrezInterface {
    void moverPeca(int origemX, int origemY, int destinoX, int destinoY);
    boolean verificarXeque();
    boolean verificarXequeMate();
    // Outros métodos para as funcionalidades do jogo
}
