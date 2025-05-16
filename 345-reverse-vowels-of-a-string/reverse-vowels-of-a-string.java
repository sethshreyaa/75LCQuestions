import java.util.Set;

class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();  // Convert String to char array directly
        int i = 0, j = s.length() - 1;

        Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');

        while (i < j) {
            while (i < j && !vowels.contains(arr[i])) { 
                i++;  // Move i forward until a vowel is found
            }
            while (i < j && !vowels.contains(arr[j])) { 
                j--;  // Move j backward until a vowel is found
            }

            // Swap vowels
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);  // Convert char array back to string
    }
}
