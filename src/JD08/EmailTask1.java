package JD08;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor email address:");
        String email = input.next();
        input.close();
        if (email.contains("_")) {
            String firstword = email.substring(0, email.indexOf("_"));
            System.out.println(firstword);
            String secondword = email.substring(email.indexOf("_") + 1,email.indexOf('@'));
            System.out.println(secondword);
            String rest=email.substring(email.indexOf('@'));
           System.out.print(secondword+"_"+firstword+rest);
        }else System.out.println(email);

    }
}
