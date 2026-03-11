package Atividade_A;



public class TesteVetorC5 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("Mclaren");
        vetor.adicionar("BMW");
        vetor.adicionar("BMW");
        vetor.adicionar("Mclaren");
        vetor.adicionar("Ferrari");

        System.out.println("Item BMW repetido: " + vetor.contarOcorrencias("BMW"));
        System.out.println("Item Mclaren repetido: " + vetor.contarOcorrencias("Mclaren"));
    }
}
