/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node<E> {
    public E item;;
    public Node next;
    public Node (E item , Node next){
        this.item = item;
        this.next = next;
    }

}
