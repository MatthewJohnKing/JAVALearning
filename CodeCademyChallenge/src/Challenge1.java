import java.util.Scanner;

public class Challenge1 {
    /*
    Challenge 1: Word Reversal:
    For this challenge, the input is a string of words, and the output should be the words in reverse but with the
    letters in the original order. For example, the string “Dog bites man” should output as “man bites Dog.”

    After you’ve solved this challenge, try adding sentence capitalization and punctuation to your code. So, the string
    “Codecademy is the best!” should output as “Best the is Codecademy!”
    My interpretation of this is that IF there is punctuation at the end, it should be copied across, and the first word
    needs to be capitalised.

    TASK COMPLETE.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input phrase to reverse:");
        String textToReverse = scanner.nextLine();
        scanner.close();
        // Issue 1, how to give sentence inputs
        //      Resolved, scanner.nextLine() instead of scanner.next()

        //Issue 2, how to take any punctuation?

        System.out.println("Initial Phrase is:" + textToReverse);
        String Reversed = ReverseText(textToReverse);
        System.out.println(Reversed);

    }

    private static String ReverseText(String inputPhrase){
        StringBuilder outputPhrase= new StringBuilder(" ");
        /*
        Expected Process,
            use String functions to break the input into the words using whitespace.
            rebuild string in reverse order.
            Expected problem, unknown number of words at the start.
            String functions should be able to adjust punctuation.
         */

        String punct = ".";
        if(inputPhrase.contains(".") ||  inputPhrase.contains("!") || inputPhrase.contains("?")){
            punct=inputPhrase.substring(inputPhrase.length()-1);
            inputPhrase=inputPhrase.substring(0,inputPhrase.length()-1);
        }

        String[] words = inputPhrase.split(" ",0 );
        int wordCount = words.length - 1;

        for(int ind=0; ind<= wordCount; ind++) {
            if(ind==0) {
                    String word1= words[wordCount - ind];
                    outputPhrase.append(word1.replaceFirst(word1.substring(0, 1), word1.toUpperCase().substring(0, 1))).append(" ");
            } else if (ind==wordCount) {
                outputPhrase.append(words[wordCount - ind]);
            }
            else {
                outputPhrase.append(words[wordCount - ind]).append(" ");
            }

        }
        outputPhrase.append(punct);
        /*
        Learnt point, can refer to the whitespace just by " ".
         */
        return outputPhrase.toString();

    }
}

