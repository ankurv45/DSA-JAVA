class CheckSubsequence {

    public static void main(String[] args) {

        String str1 = "ace";
        String str2 = "abcde";

        int j = 0;

        for (int i = 0; i < str2.length() && j < str1.length(); i++) {

            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }

        if (j == str1.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
