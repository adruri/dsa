package com.adruri.cs.searching.bst;

import lombok.Data;

@Data
class Node<T> {

    private T value;
    private Node<T> left;
    private Node<T> right;
}
