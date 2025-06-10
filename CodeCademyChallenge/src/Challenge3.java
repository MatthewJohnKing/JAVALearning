import java.util.Scanner;

public class Challenge3 {

    /*
    For a given input string, return a Boolean TRUE if the string starts with a given input word. So, for an input
    string of “hello world” and input word “hello,” the program should return TRUE.

    For a more advanced word searcher, create a program that returns the number of times a word appears in an input
    string. For example, given an input word “new” and an input string “I’m the new newt,” the program should return a
    value of 2.

    For the first task I have assumed this is not case-sensitive to not just be the startswith() String method.
    For the second I have included if the word is 'hidden' by having spaces in the middle.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give input phrase to search:");
        String textToSearch = scanner.nextLine();
        System.out.println("What word would you like to seek?:");
        String find = scanner.nextLine();
        scanner.close();

        System.out.println("Initial Phrase is:" + textToSearch);
        Boolean TF = FindWordAtStart(textToSearch,find);
        if ( TF ){
            System.out.println(find + " is at the start of the text.");
        }
        else{
            System.out.println( find + " is not at the start of the text.");
        }

        int count = HowManyTimes(textToSearch,find);
        System.out.println(find + " is in the text " + count + " times.");


    }
    private static Boolean FindWordAtStart(String textToSearch, String find){
        String lowerCasePhrase=textToSearch.toLowerCase();
        Boolean TF=lowerCasePhrase.startsWith(find.toLowerCase());
        return TF;
    }

    private static int HowManyTimes(String textToSearch,String find){
        String withoutSpaces = textToSearch.replace( " ", "");
        int count=0;
        int Seeklength=find.length();
        int Phraselength=withoutSpaces.length();
        for (int i=0; i<=Phraselength-Seeklength; i++){
            if (withoutSpaces.startsWith(find,i)){
                count+=1;
            }
        }
        return count;
    }

}
