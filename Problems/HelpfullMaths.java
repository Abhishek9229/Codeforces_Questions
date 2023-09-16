import java.util.Arrays;
import java.util.Scanner;

public class HelpfullMaths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str=str.replace("+", "");
        char ans[]=str.toCharArray();
        Arrays.sort(ans);
        for(int i =0; i<ans.length; i++){
            if(i==0){
                System.out.print(ans[i]);
            }else{
            System.out.print("+"+ans[i]);
            }
        }
        s.close();


    }
}
