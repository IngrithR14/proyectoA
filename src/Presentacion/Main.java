package Presentacion;


import Logica.Control.LinkedList;
import Presentacion.GUI.Ventana;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        LinkedList<String> list = new LinkedList<String>();
        list.addNode("1");
        list.addNode("2");
        list.addNode("3");
        list.addNode("4");
        list.addNode("5");

        Ventana ventana = new Ventana();


    }

}