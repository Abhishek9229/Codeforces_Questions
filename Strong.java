import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Strong{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            b.add(scanner.nextInt());
        }

        int mx = -2000000000;
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, a.get(i) - b.get(i));
        }
        
        for (int i = 0; i < n; i++) {
            if (a.get(i) - b.get(i) == mx) {
                res.add(i + 1);
            }
        }

        System.out.println(res.size());
        for (int i : res) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
