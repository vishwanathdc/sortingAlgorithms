public class SelectionSort implements Sort {
    @Override
    public void sort(int[] arr, int n) {
        int minimum;
        for(int i = 0; i < n - 1; i++){
            minimum = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minimum])
                    minimum = j;
            }
            swap(arr, i , minimum);
        }
    }

    private void swap(int[] arr, int i, int minimum) {
        int temp = arr[i];
        arr[i] = arr[minimum];
        arr[minimum] = temp;
    }
}
