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

        return -5;
    }

    // Parte C
    //# 8 Questão

    public void limpar(){
        for (int i = 0; i < capacidade; i++) {
            elementos[i] = null;
        }
        capacidade = 0;
    }

    //#9 Questão

    public int contarOcorrencias(String elemento){
        int contador = 0;
        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(elemento)){
                contador++;
            }
        }

        return contador;
    }

    //#10 Questão

    public boolean substituir(String antigo, String novo){
        for (int i = 0; i < capacidade; i++) {
            if (elementos[i].equals(antigo)){
                elementos[i] = novo;
                return true;
            }
        }
        return false;
    }
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String[] getElementos() {
        return elementos;
    }

    public void setElementos(String[] elementos) {
        elementos = elementos;
    }
    }

</p>
