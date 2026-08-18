class CheckAnagram {
    public static void main(String[] args) {

      String str1 = "listen";
      String str2 = "silent";
        
      int count[] = new int[256];
      if(str1.length() != str2.length()){
        System.out.println("Not a Anagram");
        return;
      }

      for(int i = 0; i < str1.length(); i++){
        char ch = str1.charAt(i);
        count[ch]++;
      }

      for(int i = 0; i < str2.length(); i++){
        char ch = str2.charAt(i);
        count[ch]--;
      }

      for(int i=0; i < count.length; i++){
          if(count[i] != 0){
            System.out.println("Not a Anagram");
            return;
          }
      }
            System.out.println("Anagram");
    }
}
