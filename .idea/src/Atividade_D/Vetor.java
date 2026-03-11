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