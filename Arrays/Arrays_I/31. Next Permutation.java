//Question Number : 31. 
//Question Name :  Next Permutation

class Solution {
    public void nextPermutation(int[] arr) {
        int index = -1;
        int n = arr.length;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such index is found, reverse the entire array (last permutation case)
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 2: Find the next greater element than arr[index] from the right
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, index, i);
                break;
            }
        }

        // Step 3: Reverse the elements to the right of index
        reverse(arr, index + 1, n - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}