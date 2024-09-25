public class QuickSort {

    // Function to partition the array on the basis of pivot element
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing the rightmost element as pivot
        int i = low - 1;  // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Returning the partition index
    }

    // The main function that implements QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot element such that elements smaller than pivot are on the left,
            // and elements greater than pivot are on the right
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after the partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
