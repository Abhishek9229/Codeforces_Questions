import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumRounding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String n = br.readLine();
            int l = n.length();
            n = '0' + n;
            StringBuilder sb = new StringBuilder(n);
            sb.reverse();
            int k = 0;

            for (int i = 0; i < l; i++) {
                if (sb.charAt(i) >= '5') {
                    char[] charArray = sb.toString().toCharArray();
                    charArray[i + 1]++;
                    for (int j = i; j >= k; j--) {
                        charArray[j] = '0';
                    }
                    sb = new StringBuilder(new String(charArray));
                    k = i;
                }
            }

            sb.reverse();
            if (sb.charAt(0) == '0') {
                for (int i = 1; i <= l; i++) {
                    System.out.print(sb.charAt(i));
                }
                System.out.println();
            } else {
                for (int i = 0; i <= l; i++) {
                    System.out.print(sb.charAt(i));
                }
                System.out.println();
            }
        }
    }
}
