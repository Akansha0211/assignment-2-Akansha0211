/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;
    private int countRight;
    public void insert(int item){
        TreeNode node = new TreeNode(item);
        if(root == null){
            root = node;
        }
        else {
            TreeNode current = root;
            TreeNode parent = null;
            while(current!= null){
                parent = current;
            }
        }

        }
        public TreeNode getRoot(){
        return root;
        }
        public void setRoot(TreeNode root){
        this.root = root;
        }


    }

