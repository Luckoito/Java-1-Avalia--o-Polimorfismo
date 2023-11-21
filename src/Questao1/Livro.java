package Questao1;

public class Livro {
    private String titulo;
    private String autor;
    
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public void exibirDetalhes() {
        System.out.println("-- Livro: " + titulo + " --");
        System.out.println("-- Autor: " + autor + " --");
        System.out.println("--------------------------------");
    }

    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
