public class RearrangeString {

    public static void main(String[] args) {

        String str = "aaabbc";

        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        int maxFrequency = 0;
        char maxChar = ' ';

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                maxChar = (char) i;
            }
        }

        if (maxFrequency > (str.length() + 1) / 2) {

            System.out.println("Not Possible");

        } else {

            char[] result = new char[str.length()];

            int index = 0;

            // Place the most frequent character first
            while (frequency[maxChar] > 0) {

                result[index] = maxChar;
                index += 2;
                frequency[maxChar]--;
            }

            // Place remaining characters
            for (int i = 0; i < frequency.length; i++) {

                while (frequency[i] > 0) {

                    if (index >= result.length) {
                        index = 1;
                    }

                    result[index] = (char) i;
                    index += 2;
                    frequency[i]--;
                }
            }

            System.out.println("Rearranged String: " + new String(result));
        }
    }
}
