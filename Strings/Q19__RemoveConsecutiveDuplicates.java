class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {

        String str = "aaabbccccdaa";

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                result = result + str.charAt(i);
            }
        }

        System.out.println("Result: " + result);
    }
}
