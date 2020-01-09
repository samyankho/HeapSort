
public class Assignment3 {

	public static void sort(int[] a) {
		int n = a.length;

		if (a == null || a.length == 0)
			return;

		// Build max heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(a, n, i); // creates a max heap(parent node is always >= child nodes)

		for (int i = n - 1; i >= 0; i--) {
			// swap first and last node
			swap(a, i, 0);

			// creates a max heap on the reduced heap 
			heapify(a, i, 0);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	// To heapify a subtree rooted with node i which is
	// an index in a[]. n is size of heap
	private static void heapify(int a[], int n, int i) {
		int largest = i; // Initialize largest as root
		int l = 2 * i + 1; // left = 2*i + 1 (i: the index of the parent node, and i starts with 0)
		int r = 2 * i + 2; // right = 2*i + 2 (i: the index of the parent node)

		// If left child is larger than root
		if (l < n && a[l] > a[largest])
			largest = l;

		// If right child is larger than largest so far
		if (r < n && a[r] > a[largest])
			largest = r;

		// If largest is not root, we swap them
		if (largest != i) {

			swap(a, i, largest);

			// Recursively heapify the affected sub-tree
			heapify(a, n, largest);
		}
	}


}
