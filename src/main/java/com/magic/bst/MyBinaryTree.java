package com.magic.bst;

public class MyBinaryTree <T extends Comparable<T>>{
    private MyBinaryNode<T> root;
    private MyBinaryNode<T> addRecursively(MyBinaryNode<T> current,T key){
        if(current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return  current;
        if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else{
            current.right = addRecursively(current.right, key);
        }
        return current;
    }
    public void add(T key){
        this.root = this.addRecursively(root,key);
    }
    public int getSizeRecursive(MyBinaryNode<T> current){
        if (current == null)
            return 0;
        else{
            return 1+ this.getSizeRecursive(current.left)+ this.getSizeRecursive(current.right);
        }
    }
    public int getSize(){
        return getSizeRecursive(root);
    }
    public MyBinaryNode<T> search(MyBinaryNode<T> current,T key){
        if(current == null||current.key == key)
            return current;
        if(current.key.compareTo(key)>0)
            return search(current.left,key);
        else{
            return search(current.right,key);
        }
    }
    public boolean searchKey(T key){
        root = search(root,key);
        if(root != null)
            return true;
        else{
            return false;
        }
    }
}