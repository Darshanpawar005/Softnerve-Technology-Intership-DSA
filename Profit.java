
import java.util.PriorityQueue;
import static java.lang.System.out;
public class Profit {
	
	public static void main(String args[]) {
		
		int arr[] = {-77,6,4,3,1};
		
		if(!(arr.length>=1 && arr.length<=105)) {
			out.println("Min Element : 1"+"\n"+"Max Elements : 105");
			return;
		}
		
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		 if(arr.length==1) {
			 
			 out.println(0);
		 }
		 
		 pq.add(arr[0]);
		 int profit=0;
		 int max_profit=0;
		 int peek;
		 int curr;
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 peek=pq.peek();
			 curr=arr[i];
			 
			 if(!(curr>=0 && curr<=104)) {
				 out.println("Min Price : 0"+"\n"+"Max Price : 104");
				 break;
			}
			 
			 
			 if(peek<curr) {
				 pq.add(curr);
				 profit=curr-peek;
				
			 }else if(peek>curr) {
				 pq.add(arr[i]);
				
			 }
			 
			 if(profit>=max_profit) {
				 max_profit=profit;
			 }
			 
		}
		 out.println("Profit : " + max_profit);
		
		//System.out.println(pq.toString());
		
	}

}
