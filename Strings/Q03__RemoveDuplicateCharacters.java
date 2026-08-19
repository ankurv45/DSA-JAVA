// 1st way

class RemoveDuplicateCharacters{
    public static void main(String[] args) {

        String str = "programming";
        char []ch = str.toCharArray();
        boolean visited[] = new boolean[ch.length];

        for (int i= 0; i < ch.length;i++){
            if (visited[i]){
                continue;
            }
            for (int j = 0; j < ch.length; j++){
                if (ch[i] == ch[j]) {
                    visited[j] = true;
                }
            }
            System.out.print(ch[i]);
        }
    }
}


//2nd way

class Main {
    public static void main(String[] args) {

        String str = "programming";
        int count[] = new int[256];

        for (int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if (count[ch] == 0){
                System.out.println(ch);
                count[ch] = 1;
            }
        }
    }
}
