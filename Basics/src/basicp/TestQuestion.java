package basicp;
import java.util.*;
public class TestQuestion implements Comparable<Integer> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

		

		int [ ] arr = {1, 2, 3, 4};

		PriorityQueue <Integer> pq = new PriorityQueue<Integer>();

		for(int x :arr)

		pq.offer(x);

		System.out.println(pq.peek());

		System.out.println(pq.poll());

		System.out.println(pq.size());

		}

		

	}


