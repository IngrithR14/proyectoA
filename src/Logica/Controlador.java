package Logica;

import Logica.Control.LinkedList;
import Logica.Modelo.NodeList;

public class Controlador {
    public String text;
    public String info;

    public LinkedList<String> linkedList = new LinkedList<String>();

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
        LinkedList<String> symbolo = new LinkedList<String>();
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
                symbolo.addNode("+");
            }
            if (aux.getInfo().equals("-")) {
                symbolo.addNode("-");
            }
            if (aux.getInfo().equals("/")) {
                symbolo.addNode("/");
            }
            if (aux.getInfo().equals("*")) {
                symbolo.addNode("*");
            }

            aux = aux.getNext();
        }

        symbolo.imprimir();
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
