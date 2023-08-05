package Logica.Control;

import Logica.Modelo.NodeList;

public class LinkedList<T> {
    private NodeList<T> head;
    private NodeList<T> last;
    private int size;

    public LinkedList() {
        head = null;
        last = null;
        size = 0;
    }

    public void addNode(T info){
        NodeList<T> newNode = new NodeList<>(info);
        if (head==null){
            head=newNode;
            last =newNode;
        }else {
            newNode.setPrevious(last);
            last.setNext(newNode);
            last=newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }
    //-->
    public void imprimir(){
        NodeList<T> aux = last;
        while (aux!=null){
            System.out.println(aux.getInfo());
            aux=aux.getPrevious();
        }
        System.out.println();
    }
}
