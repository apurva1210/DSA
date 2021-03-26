package String;

public class ValidPalindrome2 {
    public static void main(String[] args) {

        String s = "abkca";
        System.out.println(validPalindrome(s));

    }


    public static boolean validPalindrome(String s) {

        for(int i=0, j=s.length()-1; i<j; i++, j--){

            if(s.charAt(i) != s.charAt(j)){
                System.out.println(i + " " + j);
                return isPalindrome(s.substring(i+1,j+1)) || isPalindrome(s.substring(i, j));
            }


        }

        return true;

    }



    public static boolean isPalindrome(String s){

        for(int i=0, j=s.length()-1; i<j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }

        return true;
    }

}
