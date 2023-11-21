package Questao1;

public class LivroTecnico extends Livro {
    private String area;

    public LivroTecnico (String area, String titulo, String autor) {
        super(titulo, autor);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public void exibirDetalhes(){
        System.out.println("-- Livro: " + this.getTitulo() + " --");
        System.out.println("-- Autor: " + this.getAutor() + " --");
        System.out.println("-- Area: " + this.getArea() + " --");
        System.out.println("--------------------------------");
    }
}
