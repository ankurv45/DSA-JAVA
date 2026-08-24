class LongestUniqueWord {

    public static void main(String[] args) {

        String str = "java is very interesting";

        String[] words = str.split(" ");

        String longest = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            boolean unique = true;

            for (int j = 0; j < word.length(); j++) {

                for (int k = j + 1; k < word.length(); k++) {

                    if (word.charAt(j) == word.charAt(k)) {
                        unique = false;
                        break;
                    }
                }

                if (!unique) {
                    break;
                }
            }

            if (unique && word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest Unique Word: " + longest);
    }
}
