package Logica.Control;

import Logica.Modelo.NodeList;

public class LinkedList<T> {
    public NodeList<T> head;
    private NodeList<T> last;
    private int size;

    public void remove(int indice, String[] lista) {
        for (int i = indice; i < lista.length - 1; i++) {
            lista[i] = lista[i + 1];
        }
        lista[lista.length - 1] = null;
    }

    public void set(int indice, String valor, String[] lista) {
        lista[indice] = valor;
    }

    public String get(int indice, String[] lista) {
        return lista[indice];
    }

    public LinkedList() {
        head = null;
        last = null;
        size = 0;
    }

    public void addNode(T info) {
        NodeList<T> newNode = new NodeList<>(info);
        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public void deleteNode(T info) {
        if (head == null) {
            return;
        }
        if (head.getInfo().equals(info)) {
            head = head.getNext();
            size--;
            return;
        }
        NodeList<T> aux = head;
        NodeList<T> prev = null;
        while (aux != null && !aux.getInfo().equals(info)) {
            prev = aux;
            aux = aux.getNext();
        }
        if (aux == null) {
            return;
        }
        prev.setNext(aux.getNext());
        size--;
    }

    public int getSize() {
        return size;
    }

    //-->
    public void imprimir() {
        NodeList<T> aux = head;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getNext();
        }
        System.out.println();
    }

    //<--
    public void imprimirReverso() {
        NodeList<T> aux = last;
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getPrevious();
        }
        System.out.println();
    }

    public NodeList<T> buscarPos(int num) {
        NodeList<T> aux = head;
        int cont = 1;
        int x = 0;
        while (x == 0) {
            if (cont == num) {
                x = 1;
                return aux;
            }
            cont++;
            aux = aux.getNext();
        }
        return null;
    }

    public NodeList<T> buscar(T valor) {

        if (head == null) {
            return null;
        }

        if (valor.equals(head.getInfo())) {
            return head;
        }
        if (valor.equals(last.getInfo())) {
            return last;
        }

        NodeList<T> aux = new NodeList<T>();
        aux = head;
        for (int i = 0; i < size; i++) {

            if (aux.getInfo().equals(valor)) {
                return aux;
            }
            aux = aux.getNext();
        }

        return null;
    }

    public void actNode(NodeList<T> aux, T numero) {
        aux.setInfo(numero);
    }
}
