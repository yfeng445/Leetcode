public class BubbleSort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if the element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
