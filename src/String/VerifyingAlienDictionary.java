package String;

public class VerifyingAlienDictionary {

    public static void main(String[] args) {
        String s ="hlabcdefgijkmnopqrstuvwxyz";
        String[] words = new String[]{"hello","leetcode"};
        System.out.println(isAlienSorted(words,s));
    }

    public static boolean isAlienSorted(String[] words, String order) {

        int[] dic = new int[26];

        for(int i = 0; i<26; i++){
            dic[order.charAt(i) - 'a'] = i;
        }


        search: for(int i=0; i < words.length; i++){

            String word1 = words[i];
            String word2 = words[i+1];

            int smallLen = Math.min(word1.length(), word2.length());

            for(int j=0; j<smallLen; j++){
                if(word1.charAt(j) != word2.charAt(j)){
                    if(dic[word1.charAt(j) - 'a'] > dic[word2.charAt(j) - 'a']){
                        return false;
                    }

                    continue search;
                }
            }


            if(word1.length() > word2.length())
                return false;

        }

        return true;

    }
}
