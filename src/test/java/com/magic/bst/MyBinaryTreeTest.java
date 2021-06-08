package com.magic.bst;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

public class MyBinaryTreeTest {
    @Test
    public void checkMyTree() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void newElements() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(95);
        myBinaryTree.add(67);
        myBinaryTree.add(63);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(11);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        int size = myBinaryTree.getSize();
        Assertions.assertEquals(13, size);
    }

    @Test
    public void searchElements() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(95);
        myBinaryTree.add(67);
        myBinaryTree.add(63);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(11);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        boolean result = myBinaryTree.searchKey(63);
        Assertions.assertTrue(result);
    }
}
