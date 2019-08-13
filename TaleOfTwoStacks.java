import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
    
    public static void main(String[] args) {

         MyQueue queue = new MyQueue();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
              queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
              queue.dequeue();
            } else if (operation == 3) { // print/peek
              System.out.println(queue.peek());
            }
        }
        scan.close();
    }
    public static class MyQueue{
        static LinkedList<Integer> q = new LinkedList<Integer>();

        public static void enqueue(int num){
        q.add(num);
        }
        public static void dequeue(){
            q.remove(0);
        }
        public static int peek(){
            return q.get(0);
        }
    }    
}
