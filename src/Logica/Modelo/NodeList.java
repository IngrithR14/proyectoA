package Logica.Modelo;

public class NodeList<T> {

    private T info;

    private NodeList<T> next;
    private NodeList<T> previous;

    public NodeList(T info) {
        this.info = info;
        this.next = null;
        this.previous=null;
    }
    public NodeList(){
        this.info=null;
        next=null;
        previous=null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodeList<T> getNext() {
        return next;
    }

    public void setNext(NodeList<T> next) {
        this.next = next;
    }

    public NodeList<T> getPrevious() {
        return previous;
    }

    public void setPrevious(NodeList<T> previous) {
        this.previous = previous;
    }
}
