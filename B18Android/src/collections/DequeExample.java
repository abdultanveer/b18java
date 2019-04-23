package collections;
import java.util.*;  
public class DequeExample {  
	public static void main(String[] args) {  
		Deque<String> deque=new ArrayDeque<String>();  
		deque.offer("arvind");  
		deque.offer("vimal");  
		deque.add("mukul");  
		deque.offerFirst("jai"); //jai will be added to the front of the q 
		System.out.println("After offerFirst Traversal...");  
		for(String s:deque){  
			System.out.println(s);  
		}  
		//deque.poll();  
		//deque.pollFirst();//it is same as poll()  
		deque.pollLast();  //mukul shudb removed
		System.out.println("After pollLast() Traversal...");  
		for(String s:deque){  
			System.out.println(s);  
		}  
	}  
}  