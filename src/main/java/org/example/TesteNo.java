package org.example;

public class TesteNo {
    public static void main(String[] args) {
        No n2 = new No("A", null);
        No n1 = new No("B", n2);

        System.out.println("Objeto do nó: " + n1.getObjeto());
        /* Saída de "Objeto do nó:" saiu B, pois, ele pede (get-> pegar)
        o objeto do nó n1 que no caso é a letra = B.
        */
        System.out.println("Próximo nó: " + n1.getProx());
        /*Saída do "próximo nó:" saiu como (A), por conta do prox
        que se trata de "próximo" estar como (n2), assim retornando o
        objeto do nó n2 que é a letra = A.
        */
    }
}



