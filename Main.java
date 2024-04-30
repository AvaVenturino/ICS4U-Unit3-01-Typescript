/**
/**
 * Class that defines airplane speed.
 * 
 * @author Ava Venturino
 * @version 1.0
 * @since 2024-04-09
 */

import java.util.Scanner;

public class AirplaneSpeed {
    
    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    
    public static void main(String[] args) {
        String[] wordsToReverse = {"recursion", "java", "programming"};
        
        for (String word : wordsToReverse) {
            System.out.println("Original: " + word);
            System.out.println("Reversed: " + reverseString(word));
            System.out.println();
        }

        System.out.println("Done.");
    }
}
