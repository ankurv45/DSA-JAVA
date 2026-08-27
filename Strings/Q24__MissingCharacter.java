class MissingCharacter {

    public static void main(String[] args) {

        String str = "abcdefghjkl";

        for (char ch = 'a'; ch <= 'l'; ch++) {

            boolean found = false;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing Character: " + ch);
                break;
            }
        }
    }
}
