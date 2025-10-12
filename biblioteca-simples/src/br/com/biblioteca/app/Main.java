package br.com.biblioteca.app;

import br.com.biblioteca.controller.Biblioteca;
import br.com.biblioteca.model.*;
import br.com.biblioteca.view.BibliotecaView;

public class Main {
    public static void main(String[] args) {
        Biblioteca controller = new Biblioteca();
        BibliotecaView view = new BibliotecaView();

        int opcao;
        do {
            opcao = view.mostrarMenu();

            switch (opcao) {
                case 1 -> {
                    String titulo = view.lerTitulo();
                    String autor = view.lerAutor();
                    int paginas = view.lerPaginas();
                    controller.adicionarLivro(new LivroFisico(titulo, autor, paginas));
                    view.mostrarMensagem("📗 Livro físico adicionado com sucesso!");
                }
                case 2 -> {
                    String titulo = view.lerTitulo();
                    String autor = view.lerAutor();
                    double tamanho = view.lerTamanhoArquivo();
                    controller.adicionarLivro(new LivroDigital(titulo, autor, tamanho));
                    view.mostrarMensagem("📘 Livro digital adicionado com sucesso!");
                }
                case 3 -> view.mostrarLivros(controller.listarLivros());
                case 0 -> view.mostrarMensagem("Saindo da biblioteca... 👋");
                default -> view.mostrarMensagem("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}
