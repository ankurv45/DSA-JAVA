// 1st way

class CharacterFrequency{
    public static void main(String[] args) {

        String str = "programming";
        char ch[] = str.toCharArray();
        boolean visited[] = new boolean[str.length()];

        for (int i = 0 ; i < str.length(); i++){
            int count = 1;
            if (visited[i]){
                continue;
            }
            for (int j = i+1; j < str.length(); j++) {
                if (ch[i] == ch[j]){
                   count++;
                   visited[j] = true;
                }
            }
            System.out.println(ch[i]+"-->"+count);
        }
    }
}


//2nd way

class CharacterFrequency{
    public static void main(String[] args) {

        String str = "programming";
        int count[] = new int[256];

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            count[ch]++;
        }
        for (int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);

            if (count[ch] == -1) {
                continue;
            }
            System.out.println(ch+" --> " + count[ch]);
            count[ch] = -1;
        }
    }
}
