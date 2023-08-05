import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int count = 0;
        int target = 0;
        
        // Check if k is a valid index
        if (k <= n && arr[k - 1] >= 0) {
            target = arr[k - 1];
        } else {
            System.out.println("0");
            return;
        }
        
        for (int i = 0; i < n; i++) {
            if(target==0){
                if (arr[i] > target) {
                count++;
            }
            }else{
                if (arr[i] >= target) {
                count++;
            }
            }
            
        }
        System.out.println(count);
        s.close();
    }
}
