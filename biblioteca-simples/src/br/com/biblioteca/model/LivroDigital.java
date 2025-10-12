package br.com.biblioteca.model;

public class LivroDigital extends Livro {
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String toString() {
        return super.toString() + " (Digital - " + tamanhoArquivo + " MB)";
    }
}
