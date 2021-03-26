package Fb;

import java.util.HashMap;
import java.util.Map;

/**
 *  Qs to ask the interviewer
 *   will there be repeating chars in order string
 *
 *
 */

public class AlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> orderMap = new HashMap<>();

        for(int i = 0; i < order.length(); i++){
            orderMap.put(order.charAt(i), i);
        }

        search: for(int i = 0; i < words.length - 1; i++){
            String word1 = words[i];
            String word2 = words[i+1];

            for(int k = 0; k < Math.min(word1.length(), word2.length()); k++){
                if(word1.charAt(k) != word2.charAt(k)){
                    if(orderMap.get(word1.charAt(k)) > orderMap.get(word2.charAt(k))){
                        return false;
                    }
                    continue search;
                }
            }

            if(word1.length() > word2.length()) return false;
        }

        return true;
    }
}
