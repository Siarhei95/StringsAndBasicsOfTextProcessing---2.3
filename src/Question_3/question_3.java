package Question_3;//Проверить, является ли заданное слово палиндромом.
import java.util.*;

public class question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scanner.next();
        StringBuffer buffer = new StringBuffer(word);
        buffer.reverse();
        if(buffer.toString().equals(word)) {
            System.out.println("This is the word-palindrome: " + buffer);
        }else{
            System.out.println("This word is not a word-polindrome: " + word);
        }
    }

}

