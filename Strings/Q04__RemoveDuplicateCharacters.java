class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";
        char []ch = str.toCharArray();
        boolean seen[] = new boolean[256];

        for (int i= 0; i < ch.length;i++){
           if (!seen[ch[i]]){
               System.out.print(ch[i]);
               seen[ch[i]] = true;
           }
        }
    }
}
