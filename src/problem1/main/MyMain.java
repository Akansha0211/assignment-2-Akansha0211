/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(15);
        bst.insert(20);
        System.out.println("Left children of the BST ");
        System.out.println("No of parents not having left children");
       // System.out.println(bst.getCount);
    }
}
