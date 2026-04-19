package org.example;

public class TesteNo {
    public static void main(String[] args) {
        No n2 = new No("A", null);
        No n1 = new No("B", n2);

        System.out.println("Objeto do nó: " + n1.getObjeto());
        System.out.println("Próximo nó: " + n1.getProx());
    }
}
