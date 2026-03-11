package Atividade_D;

public class TesteVetor7 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("E");

        System.out.println("Vetor inicial: " + vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        System.out.println("\nRemovendo posição 0");
        vetor.remove(0);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        System.out.println("\nRemovendo posição do meio");
        vetor.remove(2);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        System.out.println("\nRemovendo última posição");
        vetor.remove(vetor.tamanho() - 1);
        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        System.out.println("\nTestando remoção inválida");

        try {
            vetor.remove(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

    }
}