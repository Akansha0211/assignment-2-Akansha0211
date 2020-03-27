/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.Queue;
import problem3.node.Node;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class takes parameter of generic type which would be replaced with concrete type
 * when object of this class is created i.e Queue <Type> q = new MyPriorityQueue <Type>();
 * To iterate through the items stored in the dataStructure we will implement an iterator
 * To make a queue as usual DataStructure where you can iterate through the queue items you should implement Iterable and Iterator interfaces
 * Java provides for each loop  to process arrays and iterable collections
 * Any iterable collection has to implement an iterator() method that returns an Iterator object
 *
 * And class implements two methods :hasNext() which returns true if there are more elements to process ,false otherwise
 * next() method that returns an item from the collection
 *
 * To make Queue DS iterable we extend Queue<E> interface by Iterable<E>
 *
 * Interface Iterable  is already defined as  a part of java.lang.Iterable
 * AS son as we extend Queue<E> interface by Iterable<E> we have to add a new method iterator() to the class MyPriorityQueue that will return an object of type Iterator<E>
 * @param <E>
 */
public class MyPriorityQueue<E> implements Queue<E> {
    // number of elements on queue
    private int size = 0;
    //beginning of queue
    private Node front;
    //end of queue
    private Node rear;

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public void enqueue(int i) {

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
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
    public class MyPriorityQueueIterator implements Iterator<E>{
        private int i = size ;
        private Node first = front; // th first node

        @Override
        public boolean hasNext() {
            return (i>0);
        }

        @Override
        public E next() {
            E item = (E) first.item;
            first = first.next;
            i--;
            return item;
        }
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
