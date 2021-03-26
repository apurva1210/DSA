package Fb;

public class ValidPalindrome2 {

    public static void main(String[] args) {
        String s = "abc";
        ValidPalindrome2 a  = new ValidPalindrome2();
        System.out.println(a.validPalindrome(s));
    }

    public boolean validPalindrome(String s) {
        for(int i = 0, j = s.length()-1; i < j ; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
               return isPalindrome(s.substring(i, j)) || isPalindrome(s.substring(i+1, j+1));
            }
        }

        return true;
    }

    public boolean isPalindrome(String s){
        for(int i = 0, j = s.length()-1; i < j ; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }

}
