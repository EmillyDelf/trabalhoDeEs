package Atividade_A;



public class TesteVetorB1 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(3);

        vetor.adicionar("Manga");
        vetor.adicionar("Repolho");
        vetor.adicionar("Maçã");
        System.out.println(" ");
        System.out.println("Tamanho do vetor > " + vetor.getCapacidade());
        System.out.println(" ");
        System.out.println("Vetor: ");
        vetor.imprimeUmPorLinha();
    }
}
