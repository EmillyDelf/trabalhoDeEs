package Atividade_A.TesteC;

import Atividade_A.Vetor;

public class TesteVetor6 {
    static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adicionar("Coca_Cola");
        vetor.adicionar("Guarana");
        System.out.println("Vetor: ");
        vetor.imprimeUmPorLinha();

        vetor.substituir("Coca_Cola","Pepsi");
        System.out.println("Vetor: ");
        vetor.imprimeUmPorLinha();
    }
}
