package Questao2;

public class Revista extends ItemBiblioteca{
    private int edicao;

    public Revista (String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void mostrarInfo(){
        System.out.println("-- Titulo: " + this.getTitulo() + " --");
        System.out.println("-- Ano de publicação: " + this.getAnoPublicacao() + " --");
        System.out.println("-- Edição: " + this.edicao + " --");
        System.out.println("--------------------------------");
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
}
