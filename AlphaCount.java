import java.util.*;
public class AlphaCount {
    public static void main(String[] args) {
        Scanner uI=new Scanner(System.in);   
        System.out.print("Enter a sentence : ");
        String sentence=uI.nextLine().trim();
        char letters [] =new char[sentence.length()];

        for(int i=0;i<letters.length;i++){
            letters[i]=sentence.charAt(i);
        }
        for(int i=0; i<letters.length;i++){
           char pCC=letters[i];
           if(letters[i+1]==pCC){
            
           }
        }
    }
}
