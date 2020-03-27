/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.Queue;
import problem3.node.Node;

import java.util.NoSuchElementException;

public class MyPriorityQueue<E> implements Queue<E> {
    // number of elements on queue
    private int size;
    //beginning of queue
    private Node front;
    //end of queue
    private Node rear;

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public void enqueue() {

    }
    public void enqueue(E item){
        Node<E> oldRear =  rear;
        rear = new Node<E>();
        rear.item = null;
        if (isEmpty()){
            front = rear;
        }
        else oldRear.next = rear;
        size++;

    }


    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return 0;
    }

    //create a constructor for the MyPriorityQueue
    //initializes an empty queue

//    public MyPriorityQueue(){
//        first = null;
//        last = null;
//        n = 0;
//
//    }
//
//    /**
//     * This method returns True when Queue is empty.
//     * @return true if this queue is empty
//     */
//    public boolean isEmpty(){
//        //return first == null;
//        return (n == 0);
//    }
//
//    /**
//     * Returns the number of items in this queue
//     * @return the number of items in this queue
//     */
//    public int size(){
//        return n;
//    }
//
//    /**
//     * This method returns the least recently added item to this queue
//     * @return the item least recently added to ths queue
//     *
//     */
//    public E peek(){
//        if (isEmpty() )throw new NoSuchElementException("Queue underflow");
//        return first.item;
//    }
//    /**
//     * This method add the item to the queue
//     * Adding of element  in  Queue is always done at the end
//     * @param item the item to enqueue
//     */
//    public void enqueue(E item){
//        Node<E> oldlast = last;
//        last = new Node<>();
//        last.item = item;
//        last.next = null;
//        if(isEmpty()) {
//            first = last;
//        }
//        else  oldlast.next = last;
//        n++;
//    }
////    public E dequeue(){
////        if(isEmpty())throw new NoSuchElementException("Queue underflow");
////         E item = first.item;
////         first = first.next;
////         n--;
////         if (isEmpty()){
////             last = null;
////             return item;
////
////         }
////
////    }
//
////    public E dequeue(){
////
////    }
//
//
//
//

}
