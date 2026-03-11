package Atividade_E_F;


public class TesteVetor9 {
    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("A");
        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("B");
        vetor.adiciona("D");
        vetor.adiciona("B");

        System.out.println("Vetor: " + vetor);

        int indice = vetor.indiceUltimo("B");

        System.out.println("Última ocorrência de B: " + indice);

        int indice2 = vetor.indiceUltimo("X");

        System.out.println("Última ocorrência de X: " + indice2);
    }
}
