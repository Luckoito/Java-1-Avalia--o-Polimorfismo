package Questao1;

public class TesteLivro {
    public void run(){
        Livro livro1 = new Livro("IT: A coisa", "Stephen King");
        LivroInfantil livro2 = new LivroInfantil(10,"Contos mágicos", "Leandro Pereira");
        LivroTecnico livro3 = new LivroTecnico("Programação","Java: do básico ao avançado", "Lucas Silveira");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
        livro3.exibirDetalhes();

    }
}
