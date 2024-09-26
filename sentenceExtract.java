import java.util.*;

public class sentenceExtract {
    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);
        boolean boo = true;

        while (boo) {
            StringBuffer para = new StringBuffer();
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                 Sentence Extractor               |");
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
                    para.append(line);
                }
            }

            System.out.println("Enter the word you want to search: ");
            String wordToSearch = uI.nextLine();

            StringTokenizer dot = new StringTokenizer(para.toString(), ".");
            String[] sentence = new String[dot.countTokens()];
            int count = 0;
            while (dot.hasMoreTokens()) {
                sentence[count++] = dot.nextToken();
            }

            StringBuffer indexofword = new StringBuffer();
            for (int i = 0; i < sentence.length; i++) {
                StringTokenizer space = new StringTokenizer(sentence[i], " ");
                String[] words = new String[space.countTokens()];
                count = 0;
                while (space.hasMoreTokens()) {
                    words[count++] = space.nextToken();
                }
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(wordToSearch)) {
                        indexofword.append(i + " ");
                    }
                }
            }

            StringTokenizer indexSpace = new StringTokenizer(indexofword.toString(), " ");
            int[] indexes = new int[indexSpace.countTokens()];
            count = 0;
            while (indexSpace.hasMoreTokens()) {
                indexes[count++] = Integer.valueOf(indexSpace.nextToken());
            }

            System.out.println("+--------------------------------------------------+");
            System.out.println("            Sentences containing the word "+wordToSearch+"         ");
            System.out.println("+--------------------------------------------------+");
            for (int i = 0; i < indexes.length; i++) {
                System.out.println(sentence[indexes[i]]);
            }
            System.out.println("+--------------------------------------------------+");
        }
    }
}
