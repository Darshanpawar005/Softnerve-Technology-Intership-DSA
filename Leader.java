import java.util.*;
import static java.lang.System.out;
public class Leader {

	public static void main(String args[]) {
		
		int arr[] = {7, 10, 4, 10, 6, 5, 2};
		
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>( new Comparator<Integer>() {
                                                                 public int compare(Integer a, Integer b){
                                                                           if (a < b)
                                                                                return 1;
                                                                           if (a > b)
                                                                                return -1;
                                                                           return 0;
                                                                 }
                                                               });
		 if(arr.length==0) {
			 return;
		 }
		 if(arr.length==1) {
			 
			 out.println(arr[0]);
			 return;
		 }
		 
		 pq.add(arr[arr.length-1]);
		 out.println(pq.peek());
		 
		 for(int i=arr.length-2;i>=0;i--) {
			
			 if(pq.peek()>arr[i]) {
				 pq.add(arr[i]);
				 continue;
			 }
			 else if(pq.peek()<arr[i]) {
				 pq.add(arr[i]);
				 out.println(pq.peek());
			 }
		}
		
		//System.out.println(pq.toString());
	}
}
