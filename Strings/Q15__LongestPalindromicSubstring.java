public class LongestPalindromicSubstring {

    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "babad";

        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String current = str.substring(i, j);

                if (isPalindrome(current) && current.length() > longest.length()) {
                    longest = current;
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longest);
    }
}
