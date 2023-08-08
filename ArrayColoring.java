import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine(); 
        
        while (t != 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int sum=0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                sum+=arr[i];

            }
            if(sum%2==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            
             
            t--;
        }
        
        s.close(); 
    }
}
