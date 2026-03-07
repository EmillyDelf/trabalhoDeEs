package Atividade_A.TesteB;

import Atividade_A.Vetor;

public class TesteVetor2 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adicionar("Iphone_12");
        vetor.adicionar("Iphone_13");
        vetor.adicionar("Iphone_14");
        vetor.adicionar("Iphone_15");

        System.out.println("Posição: " + vetor.busca("Iphone_12"));
        System.out.println("Item no vetor: " + vetor.contem("Iphone_13"));

    }
}
