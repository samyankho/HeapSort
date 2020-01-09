import java.util.Arrays;
import java.util.Random;

public class SortTesterBonus {
	
	public static void main(String[] args) {
		int length = 3000000; //array length for test running time
		int array[] = new int[length];
		int array2[] = new int[length];
		Random r = new Random();
		for (int i = 0; i < length; i++) {
			int temp = r.nextInt(length);
			array[i] = temp;
			array2[i] = temp;
		}

		System.out.print("n = ");
		System.out.print(length);
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


//		 for (int i=0;i < array.length ;i++ ) {
//		 System.out.print(array[i] + " ");
//		 }
	}

}
