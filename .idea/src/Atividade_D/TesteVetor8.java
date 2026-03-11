package Atividade_D;

public class TesteVetor8 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");

        System.out.println("Vetor inicial: " + vetor);

        System.out.println("\nRemovendo B");
        boolean removido = vetor.remove("B");
        System.out.println("Removido: " + removido);
        System.out.println(vetor);

        System.out.println("\nRemovendo X");
        boolean removido2 = vetor.remove("X");
        System.out.println("Removido: " + removido2);
        System.out.println(vetor);

    }
}