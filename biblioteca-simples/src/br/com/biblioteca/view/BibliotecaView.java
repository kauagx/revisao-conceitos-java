package br.com.biblioteca.view;

import br.com.biblioteca.model.Livro;
import java.util.List;
import java.util.Scanner;

public class BibliotecaView {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== MENU BIBLIOTECA ===");
        System.out.println("1. Adicionar livro físico");
        System.out.println("2. Adicionar livro digital");
        System.out.println("3. Listar livros");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public String lerTitulo() {
        System.out.print("Título: ");
        scanner.nextLine(); // limpa buffer
        return scanner.nextLine();
    }

    public String lerAutor() {
        System.out.print("Autor: ");
        return scanner.nextLine();
    }

    public int lerPaginas() {
        System.out.print("Número de páginas: ");
        return scanner.nextInt();
    }

    public double lerTamanhoArquivo() {
        System.out.print("Tamanho do arquivo (MB): ");
        return scanner.nextDouble();
    }

    public void mostrarLivros(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("\nNenhum livro cadastrado.");
        } else {
            System.out.println("\n📚 Livros na Biblioteca:");
            for (Livro livro : livros) {
                System.out.println(" - " + livro);
            }
        }
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
