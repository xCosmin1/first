import java.util.Scanner;

public class TwoLettersInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first letter: ");
        char letter1 = scanner.next().charAt(0);
        System.out.println("Enter second letter: ");
        char letter2 = scanner.next().charAt(0);
        if (letter1 < letter2) {
            for (int  i = letter1 +1; i < letter2; i++) {
                //System.out.println(i);
                char c = (char) i;
                System.out.println(c);

            }
        }else if (letter2 < letter1) {
            for (int i = letter1 -1; i > letter2; i--){
                char c = (char) i;
                System.out.println(c);

            }

        }
        int charDiff = letter1 - letter2;
        int absDiff = Math.abs(charDiff);
        int diff = absDiff-1;
       // System.out.println(charDiff);
        System.out.println(diff);

    }
}
