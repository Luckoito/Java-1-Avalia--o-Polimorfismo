package Questao2;

public class MidiaDigital extends ItemBiblioteca {
    private String formato;

    public MidiaDigital (String titulo, int anoPublicacao, String formato) {
        super(titulo, anoPublicacao);
        this.formato = formato;
    }

    public void mostrarInfo(){
        System.out.println("-- Titulo: " + this.getTitulo() + " --");
        System.out.println("-- Ano de publicação: " + this.getAnoPublicacao() + " --");
        System.out.println("-- Formato: " + this.formato + " --");
        System.out.println("--------------------------------");
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
