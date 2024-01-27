package JD08;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1=scanner.next();
        System.out.println("Enter second word:");
        String word2=scanner.next();
        scanner.close();
        System.out.print(word1.substring(1));
        System.out.print(word2.substring(1));

    }
}
