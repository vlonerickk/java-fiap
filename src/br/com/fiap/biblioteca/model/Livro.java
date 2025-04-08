package br.com.fiap.biblioteca.model;

public class Livro {
    public String titulo;
    public int paginas;
    public boolean disponivel;

    void emprestimo(){
        disponivel = false;

    }
}
