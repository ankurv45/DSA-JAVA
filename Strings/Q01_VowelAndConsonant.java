public class VowelAndConsonant {
    public static void main(String[] args) {

        String str = "Hello World";
        int vowels = 0;
        int consonant = 0;
        for (int i = 0 ; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == ' '){
                continue;
            }
            else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
               vowels++;
            }
            else {
               consonant++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonant);
    }
}
