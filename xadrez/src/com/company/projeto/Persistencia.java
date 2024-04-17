package com.company.projeto;

import java.io.*;

public class Persistencia {
    public static void salvarJogo(Tabuleiro tabuleiro, String nomeArquivo) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
            oos.writeObject(tabuleiro);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Tabuleiro carregarJogo(String nomeArquivo) {
        Tabuleiro tabuleiro = null;
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(nomeArquivo));
            tabuleiro = (Tabuleiro) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return tabuleiro;
    }


    public static void main(String[] args) {
        // Teste da funcionalidade de persistência
        Tabuleiro tabuleiro = new Tabuleiro();
        salvarJogo(tabuleiro, "jogo.dat");

        Tabuleiro tabuleiroCarregado = carregarJogo("jogo.dat");
        System.out.println("Tabuleiro carregado: " + tabuleiroCarregado);
    }
}
