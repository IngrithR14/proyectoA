package Logica;

import Logica.Control.BinaryTree;
import Logica.Control.LinkedList;
import Logica.Modelo.NodeList;
import Logica.Modelo.TreeNode;

import java.util.ArrayList;

public class Controlador {
    public String text;
    public String info;

    public LinkedList<String> linkedList = new LinkedList<String>();
    public LinkedList<String> symbolo = new LinkedList<String>();
    public LinkedList<String> soloNumero = new LinkedList<String>();
    public BinaryTree<String> arbol=new BinaryTree<>((o1,o2)->o1.compareTo(o2));

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

    public String controlador() {

        NodeList<String> aux = linkedList.head;


        for (int i = 0; i < linkedList.getSize(); i++) {
          /*  if (aux.getInfo().equals("(")) {
                symbolo.addNode("(");
            }
            if (aux.getInfo().equals(")")) {
                symbolo.addNode(")");
            }*/
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

        NodeList<String> aux1 = linkedList.head;
        for (int i = 0; i < linkedList.getSize(); i++) {
            if (esNumero(aux1.getInfo())) {
                soloNumero.addNode(aux1.getInfo());
            }

            aux1 = aux1.getNext();

        }
        soloNumero.imprimir();

        return crearArbol(symbolo, soloNumero);
    }
    TreeNode root = null;
    private String crearArbol(LinkedList<String> symbolo, LinkedList<String> soloNumero) {
        ArrayList<TreeNode> number = new ArrayList<TreeNode>(); // Cree una cola de matriz de tipo de nodo para almacenar números
        ArrayList<TreeNode> symbol = new ArrayList<TreeNode>();
        for (int i = 0; i < symbolo.getSize() ; i++) {
            symbol.add(new TreeNode<>(symbolo.imprimir().get(i)));
            System.out.println("añadido"+symbolo.imprimir().get(i));
        }

        System.out.println("symbol = " + symbol.size());

        for (int i = 0; i < soloNumero.getSize(); i++) {
            number.add(new TreeNode<>(soloNumero.imprimir().get(i)));
            System.out.println("añade"+soloNumero.imprimir().get(i));
        }
        System.out.println("symbol = " + number.size());
        int num=0;
        while (symbol.size()> 0) {// Cuando la cola de la matriz que almacena los símbolos es mayor que cero, el ciclo continúa. Nota: el número de símbolos es uno menos que el número
            TreeNode num1 = number.remove (0); // Eliminar el primer número de la cola de la matriz que almacena el número y asignarlo a num1
            System.out.println("esto es 1"+num1.getInfo());
            TreeNode num2 = number.remove (0); // Luego elimine el primer número de la cola de la matriz que almacena los números y asígnelo a num2
            System.out.println("esto es 2"+num2.getInfo());
            String s1= String.valueOf(symbol.get(0).getInfo());
            TreeNode s = symbol.remove (0); // Eliminar el primer símbolo de la cola de la matriz que contiene el símbolo y asignarlo a s
            System.out.println("esto es s"+s.getInfo());
            s.setLeft(num1) ; // El objeto de nodo num1 se asigna al nodo izquierdo de s
            s.setRigth(num2) ; // El objeto de nodo num2 se asigna al nodo izquierdo de s
            // Agregue el nodo de símbolo s al primer lugar donde se almacena el nodo de número
            if(s1.compareTo("*")==0){
                  num=Integer.parseInt(String.valueOf(num1.getInfo()))*Integer.parseInt(String.valueOf(num2.getInfo()));
                number.add (0, new TreeNode<>(num));
                System.out.println("Resultado="+num);
            }else if(s1.compareTo("/")==0){
                num=Integer.parseInt(String.valueOf(num1.getInfo()))/Integer.parseInt(String.valueOf(num2.getInfo()));
                number.add (0, new TreeNode<>(num));
                System.out.println("Resultado="+num);
            }else if(s1.compareTo("+")==0){
                num=Integer.parseInt(String.valueOf(num1.getInfo()))+Integer.parseInt(String.valueOf(num2.getInfo()));
                number.add (0, new TreeNode<>(num));
                System.out.println("Resultado="+num);
            } else if (s1.compareTo("-")==0) {
                num=Integer.parseInt(String.valueOf(num1.getInfo()))-Integer.parseInt(String.valueOf(num2.getInfo()));
                number.add (0, new TreeNode<>(num));
                System.out.println("Resultado="+num);
            }
        }
        root = number.get (0); // Asigna el último nodo al nodo raíz
        TreeNode n =new TreeNode(); // Crear un nuevo objeto de nodo
        n.behindbianli (root);
        return String.valueOf(num);

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

        String texto = text.replaceAll("  ", " ");
        int tamano;
        int tamanoDeParentesis;

        LinkedList<String> linkedListParentesis = new LinkedList<String>();
        tamano = texto.length();

        String[] partes = texto.split(" ");
        for (String parte : partes) {
            if (parte.equals(" ")) {

            } else {
                linkedList.addNode(parte);
            }
        }
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