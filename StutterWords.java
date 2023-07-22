import java.util.Scanner;

public class StutterWords {

    public static void main(String[] args) {

//        String text = "I am me you are you and we are both unique";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = scanner.nextLine();


        String[] words = text.split(" "); // here we split our string into words
        System.out.println("Number of words: " + words.length);
        System.out.println("Words: ");
        StringBuilder stutterWord = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < 2; i++) {
                stutterWord.append(word).append(" ");
            }
        }

        System.out.println(stutterWord);
    }
}