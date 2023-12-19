package ru.mirea.kabo0222.Tree;

public class Tree {
    int value; // значение внутри узла
    Tree left;
    Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
    public Tree(int value) {
        this.value = value;
    }

    // рекурсивный обход в глубину
    public int sum(){
        int summ = value;
        if (left != null) summ += left.sum();
        if (right != null) summ += right.sum();
        return summ;
    }

    public int sum_nodes()
    {
        int sum = 1;
        if (left != null) sum += left.sum_nodes();
        if (right != null) sum += right.sum_nodes();
        return sum;
    }

    public int height()
    {
        return 0;
    }

    public static void main(String[] args) {
        Tree root = new Tree(20, new Tree(7, new Tree(4, null, new Tree(6)),
                new Tree(9)), new Tree(35, new Tree(31, new Tree(28), null),
                new Tree(40, new Tree(38), new Tree(42))));

        System.out.println("Сумма дерева: " + root.sum());
        System.out.println("Сумма узлов дерева: " + root.sum_nodes());
    }
}
