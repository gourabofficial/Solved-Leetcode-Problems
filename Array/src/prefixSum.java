public class prefixSum {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int size = arr.length;
        int prefixSum[] = new int[size];

        prefixSum[0] = arr[0]; // 2
        for (int i = 1; i < size; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];

            int sum = prefixSum[i];
            System.out.print(sum + " ");

        }
    }
}
