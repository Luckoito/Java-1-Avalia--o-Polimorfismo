package Questao1;

public class LivroInfantil extends Livro {
    private int faixaEtaria;

    public LivroInfantil (int faixaEtaria, String titulo, String autor) {
        super(titulo, autor);
        this.faixaEtaria = faixaEtaria;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
    
    public void exibirDetalhes(){
        System.out.println("-- Livro: " + this.getTitulo() + " --");
        System.out.println("-- Autor: " + this.getAutor() + " --");
        System.out.println("-- Faixa Etária: " + this.getFaixaEtaria() + " --");
        System.out.println("--------------------------------");
    }
}
