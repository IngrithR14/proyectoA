package Logica;

import Logica.Control.LinkedList;
import Logica.Modelo.NodeList;

public class Controlador {
    public String text;
    public String info;

    public LinkedList<String> linkedList = new LinkedList<String>();
    public LinkedList<String> symbolo = new LinkedList<String>();
    public java.util.LinkedList<Integer> listas = new java.util.LinkedList<Integer>();
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void controlador() {

        NodeList<String> aux = linkedList.head;
        NodeList<String> aux1 = linkedList.head;

        for (int i = 0; i < linkedList.getSize(); i++) {
            if (aux.getInfo().equals("(")) {
                symbolo.addNode("(");
            }
            if (aux.getInfo().equals(")")) {
                symbolo.addNode(")");
            }
            if (aux.getInfo().equals("+")) {
                symbolo.addNode("3");
            }
            if (aux.getInfo().equals("-")) {
                symbolo.addNode("4");
            }
            if (aux.getInfo().equals("/")) {
                symbolo.addNode("2");
            }
            if (aux.getInfo().equals("*")) {
                symbolo.addNode("1");
            }

            aux = aux.getNext();

        }

        symbolo.imprimir();
        ordenar(symbolo);
        listas.toString();

    }

    public void ordenar(LinkedList<String> lista) {
        int temp = 0;
        int n = symbolo.getSize();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (listas.get(j - 1) > listas.get(j)) {
                    temp = listas.get(j - 1);
                    listas.set(j - 1, listas.get(j));
                    listas.set(j, temp);
                }
            }
        }
    }
    public boolean esNumero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String parentesis() {

        String texto = text.replaceAll("  "," ");
        int tamano;
        int tamanoDeParentesis;

        LinkedList<String> linkedListParentesis = new LinkedList<String>();
        tamano = texto.length();

        String[] partes = texto.split(" ");
        for (String parte : partes) {
            if (parte.equals(" ")){

            }else {
                linkedList.addNode(parte);
            }        }
        linkedList.imprimir();

        for (int i = 0; i < tamano; i++) {
            String letra = String.valueOf(texto.charAt(i));

            if (letra.equals("(")) {
                linkedListParentesis.addNode("(");
            }
            if (letra.equals(")") && linkedListParentesis.getSize() == 0) {
                info = "Parentesis Incompletos";
            }
            if (letra.equals(")") && linkedListParentesis.getSize() != 0) {
                linkedListParentesis.deleteNode("(");
            }
        }
        if (linkedListParentesis.getSize() != 0) {
            info = "Parentesis Incompletos";
        }

        return info;
    }


}
