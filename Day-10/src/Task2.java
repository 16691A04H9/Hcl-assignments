import java.awt.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
 import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Task2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList c=new ArrayList();
		for(int i=0;i<15;i++)
		{
			c.add(i);
		}
		LinkedList l=new LinkedList();
		for(int i=15;i<30;i++)
		{
			l.add(i);
		}
		System.out.println(c.addAll(l));
//		PriorityQueue pq=new PriorityQueue();
//		pq.add(15);
//		pq.add(19);
//		pq.add(154);
//		pq.add(159);
//		pq.add(185);
		 Deque<String> dque = new ArrayDeque<String>(5);  
         dque.add("Java");  
         dque.add("C");  
         dque.add("C++");  
         dque.add("Unix");  
         dque.add("Perl");          
         Queue<String> q = Collections.asLifoQueue(dque);     
         System.out.println("The resultant queue is: "+q);
         int index = Collections.binarySearch(c, 10);       
         System.out.println("index '10' is available at position: "+index);
         System.out.println("Type safe view of the List is: "+Collections.checkedList(c,Integer.class)); 
//         ArrayList li=new ArrayList(15);
//         Collections.copy(li,c);
//         System.out.println(li);
         System.out.println(Collections.disjoint(c, l));
         Iterator<String> Itr = Collections.emptyIterator();  
         while(Itr.hasNext()){  
              System.out.println(Itr.next());  
         }  
         System.out.println("Iterator list is empty."); 
         Collections.fill(c, "hello");
         System.out.println(c);
         System.out.println(Collections.frequency(c, "hello"));
         System.out.println(Collections.max(l));
         System.out.println(Collections.min(l));
         System.out.println(Collections.nCopies(2, "world"));
         System.out.println(Collections.replaceAll(c, "hello", "hey"));
         System.out.println(Collections.singletonList(l));
         Collections.reverse(l);
         System.out.println(l);
         Collections.sort(l);
         System.out.println(l);
	}

}
