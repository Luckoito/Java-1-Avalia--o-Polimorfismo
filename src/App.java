import Questao1.TesteLivro;
import Questao2.TesteBiblioteca;

public class App {
    public static void main(String[] args) {
        TesteLivro questao1 = new TesteLivro();
        TesteBiblioteca questao2 = new TesteBiblioteca();

        System.out.println("**________Questão 1________**");
        questao1.run();
        System.err.println();
        System.out.println("**________Questão 2________**");
        questao2.run();
    }
    
}
