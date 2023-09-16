import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long m = s.nextLong();
        long n = s.nextLong();
        long a = s.nextLong();
        long i = a;
        long cntM = 1;
        long cntN = 1;

        if (n % a == 0) {
            cntN = n / a;
        } else {
            while (n > i) {
                cntN++;
                i = i + a;
            }
        }

        i = a;
        if (m % a == 0) {
            cntM = m / a;
        } else {
            while (m > i) {
                cntM++;
                i = i + a;
            }
        }

        System.out.println(cntM * cntN);
        s.close();
    }
}
