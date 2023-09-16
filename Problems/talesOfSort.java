import java.util.Scanner;

public class talesOfSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t != 0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }

            int operations = countOperations(arr);
            System.out.println(operations);

            t--;
        }
        s.close();
    }

    public static int countOperations(int[] arr) {
        int operations = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int diff = arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
                operations = Math.max(operations, diff + 1);
            }
        }

        return operations;
    }
}
