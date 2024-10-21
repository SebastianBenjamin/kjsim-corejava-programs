class InvalidAlphabetException extends Exception {
    public InvalidAlphabetException(String message) {
        super(message);
    }
}

class InvalidColorException extends Exception {
    public InvalidColorException(String message) {
        super(message);
    }
}

public class DisplayColor {
 public static void main(String[] args) throws InvalidAlphabetException,InvalidColorException {
    String[] Colors = {"Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"};
    boolean boo=false;
if(args.length<1||args.length>1){
    throw new InvalidAlphabetException("Minimum 1 alphabet is accepted");
}
if(Character.isLetter(args[0].charAt(0))){
for(int i=0;i<Colors.length;i++){
    if(Colors[i].toLowerCase().charAt(0)==args[0].toLowerCase().charAt(0)){
        System.out.println("Color : "+Colors[i]);
        boo=false;
        break;
    }
    else{
        boo=true;
    }
}
if(boo){
    throw new InvalidColorException("Alphabet ' "+args[0]+" ' is not a Starting letter of a color in Colors of Rainbow");
}
}
else{
    throw new InvalidAlphabetException("' "+args[0]+" ' is not an Alphabet ");
}
 }
}
