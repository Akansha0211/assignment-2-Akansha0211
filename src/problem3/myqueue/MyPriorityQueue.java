/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

import java.util.Queue;

public class MyPriorityQueue {
    // number of elements on queue
    private int n;
    //beginning of queue
    private Node first;
    //end of queue
    private Node last;

    //create a constructor for the MyPriorityQueue
    //initializes an empty queue

    public MyPriorityQueue(){
        first = null;
        last = null;
        n = 0;

    }

    /**
     * This method returns True when Queue is empty.
     * @return true if this queue is empty
     */
    public boolean isEmpty(){
        return first == null;
    }

    /**
     * Returns the number of items in this queue
     * @return the number of items in this queue
     */
    public int size(){
        return n;
    }

}
