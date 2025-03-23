package Aula03;

public class Nodo {
    private int valor;
    private Nodo proximo;

    public Nodo(int valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public int getValor() {
        return this.valor;
    }

    public Nodo getProximo() {
        return this.proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    

}
