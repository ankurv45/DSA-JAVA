class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {

        String str = "abcabcbb";

        int maxLength = 0;
        String longest = "";

        for (int i = 0; i < str.length(); i++) {

            String current = "";

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (current.indexOf(ch) != -1) {
                    break;
                }

                current += ch;
            }

            if (current.length() > maxLength) {
                maxLength = current.length();
                longest = current;
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLength);
    }
}
