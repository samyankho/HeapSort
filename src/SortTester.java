import java.util.Arrays;
import java.util.Random;

public class SortTester {

  
    // Driver program 

	public static void main(String[] args) {
	
		
		for(int n = 10; n<10000000; n*=10) {
			int array[] = new int[n];
			int array2[] = new int[n];
			Random r = new Random();
			for (int i = 0; i < n; i++) {
				int temp = r.nextInt(n);
				array[i] = temp; // random number from 1-9
				array2[i] = temp;
			}

			System.out.print("n = ");
			System.out.print(n);
			System.out.println(":");
			long start1 = System.currentTimeMillis();
			Arrays.sort(array2);
			long end1 = System.currentTimeMillis();
			System.out.println("quicksort：" + (end1 - start1) + "ms");

			
			long start = System.currentTimeMillis();
			Assignment3.sort(array);
			long end = System.currentTimeMillis();
			System.out.println("heapsort：" + (end - start) + "ms");
			System.out.println(" ");
			
		}
//		 for (int i = 0;i < array.length ;i++ ) {
//		 System.out.print(array[i] + " ");
//		 }
//		 
//		 System.out.println(" ");
//		 
//		 for (int i = 0;i < array2.length ;i++ ) {
//			 System.out.print(array2[i] + " ");
//	     }
	}

}
