import java.util.Scanner;

public class Challenge2 {

    /*
    Starting with an input string of words, find the second-to-last word of the string. For example, an input of “I love
     Codecademy” should return “love.”
    To make your program more challenging, allow for a second numerical input, n, that results in returning the nth word
     of a string. So, for the string “I can program in Java” and n = 3, the output should be the third word, “program.”

    My interpretation of this is to actually build the latter from the start. If the word requested is bigger than the
    phrase length then I will return the last word and a statement on the matter.

    I have decided to add a feature whereby the punctuation is removed from the start and end of the word.

    Further possibles would be to change the word case to Text Case. Not implemented
    */

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input phrase to search:");
        String textToSearch = scanner.nextLine();
        System.out.println("What word would you like:");
        int wordNumber = scanner.nextInt();
        scanner.close();

        System.out.println("Initial Phrase is:" + textToSearch);
        String Word = FindWord(textToSearch,wordNumber);
        System.out.print("Word " +wordNumber + " is:");
        System.out.println(Word);

    }

    private static String FindWord(String inputPhrase,int wordNumber){
        if (wordNumber<=0){
            System.out.println("Word Number is non-positive! Setting to first word.");
            wordNumber=1;
        }
        String[] words = inputPhrase.split(" ",0 );
        int wordCount = words.length;
        String word =" ";
        if (wordCount<wordNumber){
            System.out.println("Word Number is bigger than the number of words! Setting to last word.");
            word=words[wordCount-1];
        }
        else{
            word=words[wordNumber-1];
        }

        String punct=word.substring(word.length()-1);
        while(punct.equals(".") ||  punct.equals("!") || punct.equals("?") || punct.equals("}") || punct.equals("]") || punct.equals(")")){
            word=word.substring(0,word.length()-1);
            punct=word.substring(word.length()-1);
        }

        punct=word.substring(0,1);
        while(punct.equals("{") || punct.equals("[") || punct.equals("(")){
            word=word.substring(1);
            punct=word.substring(0,1);
        }

        return word;

    }

}
