package Atividade_F;

import java.util.Arrays;

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


    public boolean inserirDepois(String referencia, String novoElemento) {

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i].equals(referencia)) {


                if (tamanho == elementos.length) {
                    return false;
                }


                for (int j = tamanho; j > i + 1; j--) {
                    elementos[j] = elementos[j - 1];
                }

                elementos[i + 1] = novoElemento;
                tamanho++;

                return true;
            }
        }

        return false;
    }

    public boolean adicionarSeNaoExiste(String elemento) {

        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return false;
            }
        }


        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }

        return false;
    }

    public void mostrar(){
        for (int i = 0; i < tamanho; i++) {
            System.out.println(elementos[i]);
        }
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "elementos=" + Arrays.toString(elementos) +
                ", tamanho=" + tamanho +
                '}';
    }
}
