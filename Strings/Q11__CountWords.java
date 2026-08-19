class CountWords {
    public static void main(String[] args) {

        String str = "Java is very powerful";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ' &&
                (i == 0 || str.charAt(i - 1) == ' ')) {

                count++;
            }
        }

        System.out.println("Words: " + count);
    }
}
