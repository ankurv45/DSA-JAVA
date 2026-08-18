class FirstNonRepeatingCharacter{
    public static void main(String[] args) {

        String str = "swiss";
        int count[] = new int[256];

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            count[ch]++;
        }
        for (int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if (count[ch] == 1) {
                System.out.println(ch);
                return;
            }
        }
    }
}
