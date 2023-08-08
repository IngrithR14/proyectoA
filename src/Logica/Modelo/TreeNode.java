package Logica.Modelo;

public class TreeNode<T> {

    private T info;
    private TreeNode left;
    private TreeNode rigth;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRigth() {
        return rigth;
    }

    public void setRigth(TreeNode rigth) {
        this.rigth = rigth;
    }

    public TreeNode(T info) {
        this.info = info;
        left = rigth = null;
    }

    public TreeNode() {
    }

    public void behindbianli(TreeNode n) {
        if (n.left != null) {
            n.behindbianli(n.rigth);
        }

        if (n.rigth != null) {
            n.behindbianli(n.left);
        }
        System.out.println(n);
        System.out.println(n.info);

        System.out.println(n.left);

        System.out.println(n.rigth);

        System.out.println("--------------");
    }


}
