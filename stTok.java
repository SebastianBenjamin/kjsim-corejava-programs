import java.util.*;

public class stTok{

public static void main(String []args){
	
Scanner ui = new Scanner(System.in);
System.out.print("Enter a string :");
String myString=ui.nextLine();

StringTokenizer comma= new StringTokenizer(myString,",");
String[] array=new String[comma.countTokens()];
int i=0;
while(comma.hasMoreTokens()){
array[i++]=comma.nextToken();

	}

System.out.println(Arrays.toString(array));

 	
	}




}