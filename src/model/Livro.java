package model;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;
    private boolean disponivelEmprestimo;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        disponivelEmprestimo = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivelEmprestimo() {
        return disponivelEmprestimo;
    }

    public void imprimeLivro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("ISBN: " + isbn);
    }

    public void emprestarLivro(Livro livro) {
        if (livro.isDisponivelEmprestimo() == true) {
            System.out.println("Livro " + livro.getTitulo() + " emprestado.");
            disponivelEmprestimo = false;
        } else {
            System.out.println("Livro não disponivel para emprestimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        if (livro.isDisponivelEmprestimo() == false) {
            System.out.println("Livro devolvido.");
            disponivelEmprestimo = true;
        } else {
            System.out.println("Este livro não foi emprestado.");
        }
    }
}