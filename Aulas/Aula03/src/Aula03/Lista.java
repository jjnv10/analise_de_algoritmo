package Aula03;

public class Lista {
    private Nodo primeiro;
    private Nodo ultimo;

    public Lista() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public void adicionar(int valor) {
        Nodo novo = new Nodo(valor);
        if (this.primeiro == null) {
            this.primeiro = novo;
            this.ultimo = novo;
        } else {
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
        }
    }

    public void imprimir() {
        Nodo atual = this.primeiro;
        while (atual != null) {
            System.out.println(atual.getValor());
            atual = atual.getProximo();
        }
    }
}
