import java.util.*;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder result = new StringBuilder();

        int i = 0, j = 0;

        while (i < n && j < m) {
            result.append(word1.charAt(i++));
            result.append(word2.charAt(j++));
        }

        while (i < n) {
            result.append(word1.charAt(i++));
        }

        while (j < m) {
            result.append(word2.charAt(j++));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first word: ");
        String word1 = scanner.next();
        
        System.out.print("Enter second word: ");
        String word2 = scanner.next();
        
        Solution solution = new Solution();
        String mergedString = solution.mergeAlternately(word1, word2);
        
        System.out.println("Merged String: " + mergedString);
        
        scanner.close();
    }
}
