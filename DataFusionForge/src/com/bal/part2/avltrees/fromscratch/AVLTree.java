package com.bal.part2.avltrees.fromscratch;

public class AVLTree {
    private class AVLNode {
        private int height;
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        private AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Value=" + value;
        }
    }

    private AVLNode node;

    public void insert(int value) {
        node = insert(node, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null)
            return new AVLNode(value);

        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);

        setHeight(root);

        return balance(root);
    }

    private AVLNode rotateLeft(AVLNode root) {
        var newRoot = root.rightChild;

        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode root) {
        var newRoot = root;

        root.leftChild = newRoot.rightChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AVLNode node) {
        node.height = Math.max(
                height(node.leftChild),
                height(node.rightChild)) + 1;
    }

    private AVLNode balance(AVLNode root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.leftChild) < 0)
                root.leftChild = rotateLeft(root.leftChild);
            return rotateRight(root);
//                System.out.println("Left Rotate " + root.leftChild.value);
//            System.out.println("Right Rotate " + root.value);
        }
        else if (isRightHeavy(root)) {
            if(balanceFactor(root.rightChild) > 0)
                root.rightChild = rotateRight(root.rightChild);
            return rotateLeft(root);
//                System.out.println("Right Rotate " + root.rightChild.value);
//            System.out.println("Left Rotate " + root.value);
        }
        return root;
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

}
