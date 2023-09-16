package Problems;
import java.util.Scanner;

public class CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t!=0){
            int n = s.nextInt();
            int result = n/2;
            if(n<2){
                System.out.println(0);
            
            }else if(n%2==0){
                System.out.println(result-1);
            }else{
                System.out.println(result);
            }
            t--;
        }
        s.close();
    }
}
