package Questao2;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro (String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void mostrarInfo(){
        System.out.println("-- Titulo: " + this.getTitulo() + " --");
        System.out.println("-- Ano de publicação: " + this.getAnoPublicacao() + " --");
        System.out.println("-- Autor: " + this.autor + " --");
        System.out.println("--------------------------------");
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
}
