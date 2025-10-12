package br.com.biblioteca.controller;

import br.com.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public boolean temLivros() {
        return !livros.isEmpty();
    }
}
