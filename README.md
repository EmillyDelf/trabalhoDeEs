<h1>Atividade 1 ABC</h1>
<h3>Main Principal</h3>
<p>
  
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


</p>

<h3>Vetor Principal</h3>

<p>



    public class Vetor {

    private String[] elementos;
    private int capacidade;

    public Vetor(int tamanho) {
        elementos = new String[tamanho];
        this.capacidade = 0;


    }

    public void adicionar(String pergunta){;

        if (capacidade < elementos.length) {
            elementos[capacidade] = pergunta;
            capacidade++;


        }
    }

    //Parte A

    //#1 questão
    public void estaVazia(){
        if (capacidade == 0){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }

    //#3 questão
    public void imprimeUmPorLinha(){
        for (int i = 0; i < capacidade; i++) {
            System.out.println(elementos[i]);
        }
    }

    // #2 questão

    public String ultimo(){
        if (capacidade == 0){
            throw new IllegalStateException("Vetor estar Vazio.");
        }

        return elementos[capacidade-1];
    }


    //#4 Quetão

    public boolean contem(String elemento){

        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(elemento)){
                return true;
            }
        }

        return false;
    }

    // #5 Busca foi adicionado por conta dos testes

    public int busca(String elemento) {
        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(elemento)){
                return i;
            }
        }


-----------------------------------------------------------------------------------------

  <h1>
    Atividade 2 / D E F
</h1>

<h3>
    Main principal
</h3>

<p>
package Atividade_D;

public class Main {
    static void main(String[] args) {

        System.out.println("Executando TesteVetor7...");
        TesteVetor7.main(args);

        System.out.println("\n---------------------------\n");

        System.out.println("Executando TesteVetor8...");
        TesteVetor8.main(args);

    }
}
</p>

<h3>
    Vetor principal
</h3>

<p>
package Atividade_D;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(String elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public int busca(String elemento) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }

        return -1;
    }

    public void remove(int posicao) {

        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        tamanho--;

        elementos[tamanho] = null;
    }

    public boolean remove(String elemento) {

        int pos = busca(elemento);

        if (pos == -1) {
            return false;
        }

        remove(pos);

        return true;
    }

    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho; i++) {
            s.append(elementos[i]);

            if (i < tamanho - 1) {
                s.append(", ");
            }
        }

        s.append("]");

        return s.toString();
    }
}
</p>
