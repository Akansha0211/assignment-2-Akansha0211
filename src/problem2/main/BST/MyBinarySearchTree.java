package problem2.main.BST;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class MyBinarySearchTree {
    private TreeNode root;
    private int countRight;
    private MyQueue preQueue;
    private MyQueue ppstQueue;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public int getCountRight() {
        return countRight;
    }

    public void setCountRight(int countRight) {
        this.countRight = countRight;
    }

    public MyQueue getPreQueue() {
        return preQueue;
    }

    public void setPreQueue(MyQueue preQueue) {
        this.preQueue = preQueue;
    }

    public MyQueue getPpstQueue() {
        return ppstQueue;
    }

    public void setPpstQueue(MyQueue ppstQueue) {
        this.ppstQueue = ppstQueue;
    }
}
