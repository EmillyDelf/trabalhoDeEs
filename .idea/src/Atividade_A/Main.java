package Atividade_A;

public class Main {
    public static void main(String[] args) {
        Vetor e1 = new Vetor(5);

        e1.adicionar("Luiz");
        e1.adicionar("luyd");
        e1.adicionar("Alysson");
        e1.estaVazia();
        e1.imprimeUmPorLinha();

        System.out.println("Ultimo do vetor: " + e1.ultimo());
        System.out.println(e1.contem("Luiz"));
        System.out.println(e1.contem("Vaca"));

        System.out.println(" ");

        System.out.println(e1.busca("Luiz"));
        System.out.println(e1.busca("Boi"));

    }
}