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
        int tamanoDeParentesis;
        LinkedList<String> linkedList = new LinkedList<String>();
        LinkedList<String> linkedListParentesis = new LinkedList<String>();
        tamano = texto.length();
        for (int i = 0; i < tamano; i++) {
            linkedList.addNode(String.valueOf(texto.charAt(i)));
            String letra = String.valueOf(texto.charAt(i));
            if (letra.equals("(")) {
                linkedListParentesis.addNode("(");
            }
            if (letra.equals(")")&&linkedListParentesis.getSize()==0) {
                texto="Parentesis Incompletos";
            }
            if (letra.equals(")")&&linkedListParentesis.getSize()!=0) {
              linkedListParentesis.deleteNode("(");
            }
        }
       if (linkedListParentesis.getSize()!=0){
           texto="Parentesis Incompletos";
       }else {

       }
        return texto;
    }


}
