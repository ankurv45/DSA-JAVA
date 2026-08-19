class CheckOnlyDigits{
    public static void main(String[] args) {

        String str = "123456";
        boolean isDigit = false;
        for (int i = 0; i < str.length();i++){
           char ch = str.charAt(i);
           if (Character.isDigit(ch)){
               isDigit = true;
           }
           else {
               isDigit = false;
              break;
           }
        }
        if (isDigit){
            System.out.println("Only Digits");
        }
        else {
            System.out.println("Not Only Digits");
        }
    }
}
