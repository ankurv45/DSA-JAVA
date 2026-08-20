class StringRotation {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "cdab";

        boolean isRotation = false;

        if (str1.length() == str2.length()) {

            String combined = str1 + str1;

            if (combined.contains(str2)) {
                isRotation = true;
            }
        }

        System.out.println("Is Rotation: " + isRotation);
    }
}
