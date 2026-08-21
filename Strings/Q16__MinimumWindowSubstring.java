public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String str = "ADOBECODEBANC";
        String target = "ABC";

        String smallest = "";

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                String current = str.substring(i, j);

                if (containsAllCharacters(current, target)) {

                    if (smallest.equals("") || current.length() < smallest.length()) {
                        smallest = current;
                    }
                }
            }
        }

        System.out.println("Minimum Window: " + smallest);
    }

    public static boolean containsAllCharacters(String str, String target) {

        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        for (int i = 0; i < target.length(); i++) {

            char ch = target.charAt(i);

            if (frequency[ch] == 0) {
                return false;
            }

            frequency[ch]--;
        }

        return true;
    }
}
