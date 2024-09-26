import java.util.*;

public class reverseProgram {
    public static void main(String[] args) {
        boolean boo = true;
        Scanner uI = new Scanner(System.in);

        while (boo) {
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                Sentence Reverser                 |");
            System.out.println("+--------------------------------------------------+");
            System.out.print(" Enter a sentence: ");
            String sentence = uI.nextLine();
            System.out.println();

            StringTokenizer space = new StringTokenizer(sentence, " ");
            String[] arrayOfWords = new String[space.countTokens()];
            int count = 0;
            
            while (space.hasMoreTokens()) {
                arrayOfWords[count++] = space.nextToken();
               
            }

            arrayOfWords = reverse(arrayOfWords);
            System.out.print(" Reversed sentence: ");
            for (int i = 0; i < arrayOfWords.length; i++) {
                System.out.print(arrayOfWords[i] + " ");
            }
          
System.out.println("\n");
            System.out.print(" Do you want to reverse another sentence?\n 1: Yes \n 2: No \n Your selection : ");
            int selection = uI.nextInt();
            uI.nextLine();
            if (selection != 1) {
                boo = false;
                System.out.println();
                System.out.println(" Exiting the Reverse program!");
            System.out.println("+--------------------------------------------------+");

            }
        }
    }

    public static String[] reverse(String[] gotString) {
        String[] myString = new String[gotString.length];
        int count = 0;
        for (int i = gotString.length - 1; i >= 0; i--) {
            myString[count++] = gotString[i]; 
        }
        return myString;
    }
}
