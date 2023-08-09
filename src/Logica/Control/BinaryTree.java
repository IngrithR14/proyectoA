package Logica.Control;

import Logica.Modelo.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BinaryTree<T> {
    private Comparator<T> comparator;
    private TreeNode<T> root;
    private List<T> list;
    public int size;
    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
        root = null;
    }
    public boolean isEmpety() {
        return root == null;
    }

    public void addNode(T info) {
        if (isEmpety()) {
            root = new TreeNode<>(info);
            size++;
        } else {
            TreeNode<T> newNode = new TreeNode<>(info);
            TreeNode<T> aux = root;
            TreeNode<T> ant = null;
            while (aux != null) {
                ant = aux;
                aux = comparator.compare(info, aux.getInfo()) < 0 ? aux.getLeft() : aux.getRigth();

            }
            if (comparator.compare(info, ant.getInfo()) < 0) {
                ant.setLeft(new TreeNode<>(info));
            } else {
                ant.setRigth((new TreeNode<>(info)));
            }
            size++;
        }
    }

    private void presort(TreeNode<T> node) {
        if (node != null) {
            list.add(node.getInfo());
            presort(node.getLeft());
            presort(node.getRigth());
        }

    }
    public List<T> ListPresort() {
        list = new ArrayList<>();
        presort(root);
        return list;

    }
    public List<T> ListInsort() {
        list = new ArrayList<>();
        inSort(root);
        return list;
    }

    private void inSort(TreeNode<T> node) {
        if (node != null) {
            inSort(node.getLeft());
            list.add(node.getInfo());
            inSort(node.getRigth());
        }
    }

    public List<T> ListPosort() {
        list = new ArrayList<>();
        proSort(root);
        return list;
    }

    private void proSort(TreeNode<T> node) {
        if (node != null) {

            proSort(node.getLeft());
            proSort(node.getRigth());
            list.add(node.getInfo());
        }
    }
    public int getSize() {
        return size;
    }
}