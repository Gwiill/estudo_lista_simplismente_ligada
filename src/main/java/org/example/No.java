package org.example;

public class No {
    private Object objeto;
    private No prox;

    public No(Object objeto, No prox) {
        this.objeto = objeto;
        this.prox = prox;
    }

    public Object getObjeto() {
        return objeto;
    }

    public void setObjeto(Object objeto) {
        this.objeto = objeto;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No{objeto=" + objeto + "}";
    }
}
