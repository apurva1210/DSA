package String;

//Given two binary strings a and b, return their sum as a binary string.
//
//
//
//        Example 1:
//
//        Input: a = "11", b = "1"
//        Output: "100"
//        Example 2:
//
//        Input: a = "1010", b = "1011"
//        Output: "10101"
//
//
//        Constraints:
//
//        1 <= a.length, b.length <= 104
//        a and b consist only of '0' or '1' characters.
//        Each string does not contain leading zeros except for the zero itself.

import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinaryP("11", "1"));
    }


    //without plus sign
    public static String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger ans, carry;

        while(y.compareTo(zero) != 0){
            ans = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = ans;
            y = carry;
        }

        return x.toString(2);
    }

    //with plus sign
    public static String addBinaryP(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1 ;

        int carry = 0;

        StringBuilder sb  = new StringBuilder();


        while(i>=0 || j>=0){
            int ans = carry;

            if(i>=0){
                ans += a.charAt(i--) - '0';
            }

            if(j>=0){
                ans += b.charAt(j--) - '0';
            }

            sb.insert(0, ans%2);
            carry = ans / 2;
        }

        if(carry == 1) sb.insert(0, 1);
        return sb.toString();
    }

    //without using add operator
    public String addBinary3(String a, String b) {

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;


        while(i >= 0 || j >= 0){

            if(i >= 0 && a.charAt(i--) == '1') carry++;

            if(j >= 0 && b.charAt(j--) == '1') carry++;

            sb.insert(0 , carry % 2);
            carry /= 2;

        }

        if(carry > 0) sb.insert(0, carry);
        return sb.toString();

    }
}
