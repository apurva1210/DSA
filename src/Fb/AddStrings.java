package Fb;

public class AddStrings {

    public String addStrings(String num1, String num2) {

        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int val;

        while(l1 >= 0 || l2 >= 0){
            val = carry;
            val += l1 > 0 ? num1.charAt(l1--) - '0' : 0;
            val += l2 > 0 ? num2.charAt(l1--) - '0' : 0;

            ans.append(val % 10);
            carry = val / 10;
        }

        if(carry > 0 ) ans.append(carry);

        return ans.reverse().toString();

    }
}
