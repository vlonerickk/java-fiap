package br.com.fiap.biblioteca.view;

import br.com.fiap.biblioteca.model.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        Scanner leitor = Scanner (System.in);

        //Atribuir um titulo ao livro
        System.out.println("Título: ");
        livro.titulo = leitor.next() + leitor.nextLine();

        System.out.println("Número de páginas: ");
        livro.paginas = leitor.nextInt();

        System.out.println("Esse livro está disponível? ");
        livro.disponivel = leitor.nextBoolean();

    }
}
