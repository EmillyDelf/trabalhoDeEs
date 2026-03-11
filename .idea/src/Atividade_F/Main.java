package Atividade_F;

public class Main {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);
        System.out.println("TesteVetor11 - adicionar várias vezes");

        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("A");
        vetor.adicionarSeNaoExiste("A");

        vetor.mostrar();

        Vetor vetor1 = new Vetor(10);

        vetor1.adiciona("A");
        vetor1.adiciona("C");
        vetor1.adiciona("D");

        System.out.println("\nVetor inicial:");
        vetor1.mostrar();
        System.out.println("\nTesteVetor12 - inserir depois");

        vetor.inserirDepois("A", "B");

        vetor1.mostrar();
    }
}