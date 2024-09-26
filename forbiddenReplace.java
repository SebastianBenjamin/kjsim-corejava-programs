import java.util.*;

public class forbiddenReplace {
    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);
        boolean boo = true;

        while (boo) {
            StringBuffer para = new StringBuffer();
            String[] myWords;
            StringBuffer result = new StringBuffer();

            System.out.println("+--------------------------------------------------+");
            System.out.println("|              Forbidden Replace Program           |");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| Enter your paragraph. Type '404' on a new line   |");
            System.out.println("| to end the input.                                |");
            System.out.println("+--------------------------------------------------+");
            System.out.println();

            boolean boo1 = true;
            while (boo1) {
                String line = uI.nextLine().trim();
                if (line.equals("404")) {
                    boo1 = false;
                } else {
                    para.append(" "+line+"\n");
                }
            }
System.out.println();
            System.out.print("Enter word to Replace: ");
            String findWord = uI.nextLine().trim();
         
            StringTokenizer tokenSpace = new StringTokenizer(para.toString(), " .");
            myWords = new String[tokenSpace.countTokens()];

            int count = 0;
            while (tokenSpace.hasMoreTokens()) {
                myWords[count] = tokenSpace.nextToken();
                count++;
            }
            if(check(myWords, findWord)){
                System.out.println();
            System.out.print("Do you want to replace the word '" + findWord + "' with :\n 1: *\n 2: $ \n 3: # \n Your Selection: ");
            int charsel = uI.nextInt();
            uI.nextLine(); 

            String replacement = "";
            switch (charsel) {
                case 1:
                    replacement = "*"; 
                    break;
                case 2:
                    replacement = "$";
                    break;
                case 3:
                    replacement = "#";
                    break;
                default:
                    System.out.println("+--------------------------------------------------+");
                    System.out.println(" Invalid selection!");
                    System.out.println("+--------------------------------------------------+");
                    continue;
            }

            for (int i = 0; i < myWords.length; i++) {
                if (myWords[i].equals(findWord)) {
                    for(int j=0;j<findWord.length();j++){
                        result.append(replacement);
                    }
                    result.append(" ");
                   
                } else {
                    result.append(myWords[i]+" ");
                }
            }

            System.out.println();
            System.out.println("+--------------------------------------------------+");
            System.out.println(" Result paragraph: ");
            System.out.println(" "+result.toString().trim());
            System.out.println("+--------------------------------------------------+");
        }
        else{
            System.out.println();
            System.out.println(" WORD "+findWord+" IS NOT PRESENT IN THE GIVEN SENTENCE !");
        }
        System.out.println();
            System.out.print("Do you want to find and replace words in a new paragraph?\n 1: Yes\n 2: No\n Your selection: ");
            int selection = uI.nextInt();
            uI.nextLine(); 

            if (selection != 1) {
                boo = false;
                System.out.println(" Exiting the program !");
                System.out.println("+--------------------------------------------------+");
            }
        }
        uI.close();
    }
    public static boolean check(String[] myArray, String word) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].equals(word)) {
                return true;
            }
        }
        return false; 
    }
    
}
