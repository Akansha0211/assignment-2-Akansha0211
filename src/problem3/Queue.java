package problem3;

/**
 * A queue is a container to which items are added and removed by following FIFO stategy
 * There are an item added first will be removed first
 * Just like a queue in practical world ,Imagine a queue in BoxOffice
 * Queue has two ends whuch are pointed by two pointers front and rear
 * Front pointer points to the front where the items are removed from
 * while the rear points to the end where items are added in queue
 *
 * Queue interface :
 * To make end user independent from implementation details
 * whether it is implemented using LinkedList or Array
 *
 * @param <E> THis facilitates the generic use of Queue DataStructures
 * It allows programmer to pass the object type the queue will store at run time
 * A special feature of Jva called  GENERICS brings us this capability.
 */
public interface Queue<E> extends Iterable<E>{
    //This method will remove the element from Th Queue
    E dequeue();
    // This method will add elements to the end of the Queue
    void enqueue(int i);

    void enqueue();

    // Returns true if the queue is empty , false otherwise
    boolean isEmpty();
    //Returns the number of elements in the queue right now
    int size();

}
