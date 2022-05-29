
import static java.lang.System.out;
public class XoR {
 
	public static void main(String args[]) {
		
		int initHeight=0;
		int initSum=0;
		out.println("XOR subset sum : "+xorSum(new int[]{5,1,6}, initHeight, initSum));
	}
	
	private static int xorSum(int arr[], int height, int sum) {
		
		int next;
		int prev;
		
		if(height==arr.length) {
			return sum;
		}
		
		next = xorSum(arr, height+1, sum^arr[height]);
		prev = xorSum(arr,height+1,sum);
		
		return next+prev;
	}
}
