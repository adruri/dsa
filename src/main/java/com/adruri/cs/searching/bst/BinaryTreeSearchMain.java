package com.adruri.cs.searching.bst;

import com.adruri.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;

@Slf4j
public class BinaryTreeSearchMain {

    private static final int ARRAY_SIZE = 30;
    private static final int MIN = 0;
    private static final int MAX = 99;

    public static void main(String[] args) {

        log.info("Binary search tree");

        Integer[] array = Arrays.stream(ArrayUtil.generateRandomArray(ARRAY_SIZE, MIN, MAX)).distinct().boxed()
            .toArray(Integer[]::new);
        Arrays.sort(array);

        Node<Integer> root = BinarySearchTree.sortedArrayToBst(array, 0, array.length - 1);

        log.info("Root");
        BinarySearchTree.print(root);
    }
}
