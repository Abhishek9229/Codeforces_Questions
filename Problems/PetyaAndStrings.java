import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String one = s.nextLine().toLowerCase();
        String two = s.nextLine().toLowerCase();

        int ans = one.compareTo(two);
        if(ans<0){
            System.out.println("-1");

        }else if(ans>0){
            System.out.println("1");

        }else if(ans==0){
            System.out.println("0");

        }
        
    }
}
