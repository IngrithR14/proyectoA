package Presentacion;


import Logica.Control.BinaryTree;
import Logica.Control.LinkedList;
import Presentacion.GUI.Ventana;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

       // Ventana ventana = new Ventana();

        BinaryTree<Integer> num = new BinaryTree<Integer>((o1, o2) -> Integer.compare(o1, o2));

        num.addNode(50);
        num.addNode(20);
        num.addNode(30);
        num.addNode(10);
        num.addNode(70);
        num.addNode(68);
        num.addNode(72);
        num.addNode(56);
        num.addNode(34);
        num.addNode(73);
        num.addNode(29);

         System.out.println(num.ListPresort());
        System.out.println(num.ListInsort());
        System.out.println(num.ListPosort());

    }

}