package Questao2;

public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;

    public ItemBiblioteca (String titulo, int anoPublicacao){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public void mostrarInfo(){
        System.out.println("-- Titulo: " + titulo + " --");
        System.out.println("-- Ano de publicação: " + anoPublicacao + " --");
        System.out.println("--------------------------------");
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

}
