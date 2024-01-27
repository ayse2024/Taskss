package JD08;
import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=input.next();
        input.close();
        char firstch= word.charAt(0);

        if(firstch=='x'){
            word=word.replaceFirst("x","a");
        }
        System.out.println(word);

    }
}
