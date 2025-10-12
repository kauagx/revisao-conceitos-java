package br.com.biblioteca.model;

public class LivroFisico extends Livro {
    private int paginas;

    public LivroFisico(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return super.toString() + " (Físico - " + paginas + " páginas)";
    }
}
