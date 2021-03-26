package String;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        boolean ans = wordBreak.wordBreak(s, wordDict);
        System.out.println("ans = " + ans);
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        for (String word:wordDict) {

        }
        return true;
    }
}
