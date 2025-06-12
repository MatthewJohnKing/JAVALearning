import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class Challenge4 {

    /*
    Two words are anagrams if they contain the same letters but in a different order. Here are a few examples of anagram
    pairs:

    “listen” and “silent”
    “binary” and “brainy”
    “Paris” and “pairs”
    For a given input of two strings, return a Boolean TRUE if the two strings are anagrams.

    As an added challenge, for a given array of strings, return separate lists that group anagrams together. For
    example, the input {“tar,” “rat,” “art,” “meats,” “steam”}, the output should look something like
    {[“tar,” “rat,” “art”], [“meats,” “steam”]}.

    Current result returns a list of lists.
     */

    public static void main(String[] args) {
        String word1="heep";
        String word2="pehh";
        Boolean yesNo = isAnagram(word1,word2);
        System.out.println(yesNo);

        List<String> wordList = List.of("help","hepl","hple","pelh","poof", "pofo", "ofpo");
        List<List<String>> ListList = sortAnagrams(wordList);
        System.out.println(ListList);
    }


    private static Boolean isAnagram(String word1, String word2){
        Boolean ans = false;
        if (word1.length()==word2.length()){
           for(int letter=0; letter<word1.length(); letter++){
               String character= word1.substring(letter,letter+1);
               if(word2.contains(character)){
                   word2=word2.replaceFirst(character,"");
               }
               else{
                   break;
               }
           }
           if(word2.length()==0){
               ans=true;
           }
        }

        return ans;
    }

    private static List<List<String>> sortAnagrams(List<String> words){
        List<List<String>> ListList = new ArrayList<List<String>>();
        Boolean newListReq=true;
        for (String word : words) {

            for (List<String> wordlist : ListList){
                if (isAnagram(word, wordlist.getFirst())) {
                    wordlist.add(word);
                    newListReq=false;
                } else {
                    newListReq=true;
                }}
                if (ListList.size()==0 || newListReq == true){
                    List<String> newlist = new ArrayList<>();
                    newlist.add(word);
                    ListList.add(newlist);
                    newListReq=false;
                }
        }
        return ListList;

    }


}
