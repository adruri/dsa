package com.arr.cs.searching.bst;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class BinarySearchTree {

    static <T extends Comparable<T>> Node<T> insert(Node<T> root, T data) {

        if (root == null) {
            root = new Node<>();
            root.setValue(data);
        } else if (data.compareTo(root.getValue()) <= 0) {
            insert(root.getLeft(), data);
        } else {
            insert(root.getRight(), data);
        }

        return root;
    }

    static <T extends Comparable<T>> Node<T> sortedArrayToBst(T[] array, int start, int end) {

        if (start > end) {
            return null;
        }

        int middle = (start + end) / 2;

        Node<T> root = new Node<>();
        root.setValue(array[middle]);

        root.setLeft(sortedArrayToBst(array, start, middle - 1));
        root.setRight(sortedArrayToBst(array, middle + 1, end));

        return root;
    }

    static <T> void print(Node<T> root) {

        if (root == null) {
            return;
        }

        print(root.getLeft());
        log.info(root.getValue().toString());
        print(root.getRight());
    }

}
