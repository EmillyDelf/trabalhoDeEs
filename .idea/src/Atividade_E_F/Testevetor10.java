package Atividade_E_F;

public class Testevetor10 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("B");

        System.out.println("Vetor inicial: " + vetor);

        System.out.println("\nRemovendo todos os B");

        vetor.removerTodos("B");

        System.out.println("Vetor final: " + vetor);
    }
}
