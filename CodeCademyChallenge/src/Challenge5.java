import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Challenge5 {

    /*

    A pangram is a sentence that contains all 26 letters of the English alphabet. One of the most well-known examples
    of a pangram is, “The quick brown fox jumps over the lazy dog.” Create a pangram checker that returns a Boolean
    TRUE if an input string is a pangram and FALSE if it isn’t.

    For an added pangram challenge, create a perfect pangram checker. A perfect pangram is a sentence that uses each
    letter of the alphabet only once, such as, “Mr. Jock, TV quiz Ph.D., bags few lynx.”


    Feels like an easy challenge
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input phrase to check:");
        String textToSearch = scanner.nextLine();
        scanner.close();

        System.out.println("Initial Phrase is:" + textToSearch);
        int num = PangramsCheck(textToSearch);
        if ( num==1 ){
            System.out.println(textToSearch + " is a panagram.");
        }
        else if( num ==2 ){
            System.out.println( textToSearch + " is a perfect panagram.");
        }
        else{
            System.out.println( textToSearch + " is not a panagram.");
        }

    }

    private static int PangramsCheck(String Phrase) {
        int num = 0;
        List<String> SpecialCharacters = List.of(" ", "|", "`", "¬", "!", "£", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "}", "]", "{", "[", ":", ";", "@", "'", "~", "#",",","<",".",">","/","?");
        String nospaces = Phrase.toLowerCase();
        for( String S :SpecialCharacters) {
            nospaces = nospaces.replace(S, "");
        }
        List<String> alaphabet = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        for (String letter : alaphabet) {
            if (!nospaces.contains(letter)) {
                System.out.println(nospaces);
                break;
            } else {
                nospaces=nospaces.replaceFirst(letter, "");
            }
            if (letter.equals("z")) {
                num = 1;
                break;
            }
        }
        if ( num==1 && nospaces.isEmpty()){
            num = 2;
        }
        else{
            System.out.println(nospaces);
        }
        return num;
    }
}
