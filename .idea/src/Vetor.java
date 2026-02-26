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

    public void estaVazia(){
        if (capacidade == 0){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }

    public void imprimeUmPorLinha(){
        for (int i = 0; i < capacidade; i++) {
            System.out.println(elementos[i]);
        }
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