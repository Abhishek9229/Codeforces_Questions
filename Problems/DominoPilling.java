import java.util.Scanner;

public class DominoPilling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        int max = m*n/2;
        System.out.println(max);
        s.close();

    }
}
