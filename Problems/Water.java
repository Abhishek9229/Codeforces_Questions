import java.util.Scanner;

public class Water {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0 && n>=4){
                System.out.println("Yes");
            
            
        }else{
            System.out.println("No");
        }
        s.close();
    }
}
