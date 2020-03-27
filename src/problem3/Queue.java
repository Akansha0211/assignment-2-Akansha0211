package problem3;

public interface Queue<E> {
    //This method will remove the element from Th Queue
    E dequeue();
    // This method will add elements to the end of the Queue
    void enqueue();
    // Returns true if the queue is empty , false otherwise
    boolean isEmpty();
    //Returns the number of elements in the queue right now
    int size();

}
