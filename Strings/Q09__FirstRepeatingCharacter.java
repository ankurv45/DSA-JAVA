class FirstRepeatingCharacter{
    public static void main(String[] args) {

        String str = "programming";
        int count[] = new int[256];

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            count[ch]++;
            if (count[ch] == 2){
                System.out.println(ch);
                break;
            }
        }

    }
}
