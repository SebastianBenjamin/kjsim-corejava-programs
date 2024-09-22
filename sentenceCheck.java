    import java.util.*;
    public class sentenceCheck {
        public static void main(String[] args) {
            Scanner uI=new Scanner(System.in);
            boolean boo1=true;
            boolean boo2=true;
            while(boo1){
                boo2=true;
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                Sentence Check Program            |");
            System.out.println("+--------------------------------------------------+");
            System.out.println("| Enter your paragraph. Type '404' on a new line   |");
            System.out.println("| to end the input.                                |");
            System.out.println("+--------------------------------------------------+");
            System.out.println();
        String para="";
        String line;
        int line_count=0;
        int sent_count=0;
        int word_count=0;
        int vowels_count=0;
        int[] count=new int[10000];
        int count_v=0;
        int count_i=0;
        while (boo2) {
            line=uI.nextLine().trim();
            if(line.equals("404")){
            boo2=false;
            }
                for(int i=0;i<line.length();i++){
                    if(line.charAt(i)=='.'){
                        sent_count++;
                    }
                }
        
            para+=" \n "+line;
            line_count++;
            String[] word_arr=line.split(" ");
            word_count+=word_arr.length;
            for(int i=0;i<word_arr.length;i++){
                String myWord=word_arr[i].toLowerCase();
                for(int j=0;j<myWord.length();j++){
                    count_v++;
                    if(myWord.charAt(j)=='a'||myWord.charAt(j)=='e'||myWord.charAt(j)=='i'||myWord.charAt(j)=='o'||myWord.charAt(j)=='u'){
                        vowels_count++;
                        count[count_i]=count_v;
                        count_i++;
                    }
                  
                }
            }
            if(sent_count==0){
                sent_count=1;
            }
        }
        System.out.println();
        System.out.println("+--------------------------------------------------+");
        System.out.println("|                  Checking Results                |");
        System.out.println("+--------------------------------------------------+");
        System.out.println(" The Paragraph you have enetered: \n ' " + para.trim().replace("404", "")+" '");
        System.out.println(" Total words: " + (word_count-1));
        System.out.println(" Total lines: " + (line_count-1));
        System.out.println(" Total sentences: " + sent_count);
        System.out.println(" Total vowels: " + vowels_count);
        System.out.println();
        System.out.println(" Indexes(ignore spaces) of vowels in given paragraph :");
        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.print(count[i]+" ");
                
            }
        }
        System.out.println();
        System.out.println("+--------------------------------------------------+");
       
        System.out.println();
        System.out.print(" Do you want to check more paragraphs? \n 1: Yes \n 2: No\n Your selection: ");
        int selection = uI.nextInt();
        uI.nextLine();
        if (selection != 1) {
            System.out.println();
            System.out.println("   Exiting the Sentence Checker Program. Goodbye!");
            System.out.println("+--------------------------------------------------+");
        boo1=false;
        uI.close();
        }
    


        }
    }}