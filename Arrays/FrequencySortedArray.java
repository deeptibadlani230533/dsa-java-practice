public class FrequencySortedArray {
    public static void findFrequency(int arr[]) {
        int n = arr.length;
        if (n == 0) return;
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }
        // print last element frequency
        System.out.println(arr[n - 1] + " -> " + count);
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 4, 4};
        findFrequency(arr);
    }
}

