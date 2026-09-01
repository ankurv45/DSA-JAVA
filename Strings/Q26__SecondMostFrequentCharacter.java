class SecondMostFrequentCharacter {

    public static void main(String[] args) {

        String str = "aaabbbccdddd";

        int[] frequency = new int[256];

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        int highest = 0;
        int secondHighest = 0;

        // Find highest frequency
        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > highest) {
                highest = frequency[i];
            }
        }

        // Find second highest frequency
        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] < highest && frequency[i] > secondHighest) {
                secondHighest = frequency[i];
            }
        }

        // Find character with second highest frequency
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (frequency[ch] == secondHighest) {
                System.out.println("Second Most Frequent Character: " + ch);
                break;
            }
        }
    }
}
