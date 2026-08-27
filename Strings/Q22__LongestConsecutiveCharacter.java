class LongestConsecutiveCharacter {

    public static void main(String[] args) {

        String str = "aaabbccccddeee";

        char longestChar = str.charAt(0);
        int maxCount = 1;

        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                longestChar = str.charAt(i);
            }
        }

        System.out.println("Character: " + longestChar);
        System.out.println("Count: " + maxCount);
    }
}
