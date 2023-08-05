import java.util.Scanner;

public class wordsLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < t; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                String abbreviation = getAbbreviation(word);
                System.out.println(abbreviation);
            } else {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    public static String getAbbreviation(String word) {
        int length = word.length() - 2;
        return word.charAt(0) + String.valueOf(length) + word.charAt(word.length() - 1);
    }
}
