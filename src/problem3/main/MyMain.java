/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.Student;
import problem3.myqueue.MyPriorityQueue;

import java.util.Queue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
       MyPriorityQueue<Student> queue = new MyPriorityQueue<Student>();
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println("Queue contains following items til thus moment");
        for(Student i : queue ){
            System.out.println(i);
        }

    }
}
