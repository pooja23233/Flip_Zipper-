import java.util.Scanner;

public class FlipZipper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to flip: ");
        String word = scanner.nextLine();
        String flippedWord = flipWord(word);
        System.out.println("Flipped word: " + flippedWord);
        scanner.close();
    }

    public static String flipWord(String word) {
        StringBuilder flipped = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            flipped.append(word.charAt(i));
        }
        return flipped.toString();
    }
}