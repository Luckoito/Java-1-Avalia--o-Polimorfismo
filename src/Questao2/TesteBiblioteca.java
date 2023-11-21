package Questao2;

public class TesteBiblioteca {
    public void run() {
        ItemBiblioteca itemGenerico = new ItemBiblioteca("As vantagens de ser genérico", 2022);
        Livro livro = new Livro("A grama alta", 2005, "Stephen King");
        Revista revista = new Revista("Veja", 2022, 20024);
        MidiaDigital filme = new MidiaDigital("Programação em java 2: A avaliação final", 2023, "mkv");

        itemGenerico.mostrarInfo();
        livro.mostrarInfo();
        revista.mostrarInfo();
        filme.mostrarInfo();

    }
}
