package Fb;

import java.math.BigInteger;

public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder ans  = new StringBuilder();
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;

        int carry = 0;

        while(l1 >= 0 || l2 >= 0){

            if(l1 >= 0 && a.charAt(l1--) == '1') carry++;
            if(l2 >= 0 && b.charAt(l2--) == '1') carry++;

            ans.append(carry % 2);
            carry /= 2;
        }

        if(carry > 0) ans.append(carry);

        return ans.reverse().toString();
    }


}
