import java.util.Scanner;

public class Beautiful {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    a = i;
                    b = j;
                }
            }
        }
        int ans = Math.abs(2 - a) + Math.abs(2 - b);
        System.out.println(ans);

        s.close();
    }
}
