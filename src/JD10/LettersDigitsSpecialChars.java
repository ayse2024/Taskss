package JD10;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str="Wooden Spoon123!";
        String letters="";
        String digits="";
        String sChar="";

        for (char each :str.toCharArray()) {
            if (Character.isLetter(each)) {
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            } else {
                sChar += each;
            }
        }
            System.out.println("Letters: " +letters );
            System.out.println("Digits: "+ digits);
            System.out.println("Special Characters= "+ sChar);
    }
}
