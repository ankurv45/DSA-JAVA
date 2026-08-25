public class CommonUniqueCharacter {

    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "paper";

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frequency1[str1.charAt(i)]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            frequency2[str2.charAt(i)]++;
        }

        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            if (frequency1[ch] == 1 && frequency2[ch] == 1) {
                System.out.println("Common unique character: " + ch);
                break;
            }
        }
    }
}
