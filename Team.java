import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans =0;
        while(n!=0){
            int cnt=0;
            int a = s.nextInt();
            int b =s.nextInt();
            int c=s.nextInt();
            if(a==1){
                cnt++;
            }
            if(b==1){
                cnt++;
            }
            if(c==1){
                cnt++;
            }
            if(cnt>=2){
                ans++;
            }

            n--;
        }
        System.out.println(ans);
        s.close();
        
    }
}
