package Logica;

import Logica.Control.LinkedList;

public class Controlador {
    public String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        controlador();
    }

    public String controlador() {
        String texto = text;
        int tamano;
        LinkedList<String> linkedList = new LinkedList<String>();
        tamano=texto.length();
        for (int i = 0; i < tamano; i++) {
            linkedList.addNode(String.valueOf(texto.charAt(i)));
        }
        return "";
    }


}