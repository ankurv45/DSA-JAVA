class ReverseEachWord {

    public static void main(String[] args) {

        String str = "I love java programming";

        String[] words = str.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                result = result + word.charAt(j);
            }

            result = result + " ";
        }

        System.out.println(result);
    }
}
