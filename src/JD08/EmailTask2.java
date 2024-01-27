package JD08;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yor email address:");
        String email = input.next();
        if (email.contains("_")) {
            String firstword = email.substring(0, email.indexOf("_"));
            char firstch=firstword.charAt(0);
            char upperfirstch=Character.toUpperCase(firstch);
            String firstname=firstword.replace(firstword.charAt(0),upperfirstch);
            System.out.println("First name: "+firstname);
            String secondword = email.substring(email.indexOf("_") + 1,email.indexOf('@'));
            char firstcha=secondword.charAt(0);
            char upperfirstcha=Character.toUpperCase(firstcha);
            String lasttname=secondword.replace(secondword.charAt(0),upperfirstcha);
            System.out.println("Last name: "+lasttname);
            String domain=email.substring(email.indexOf('@')+1,email.indexOf('.'));
            System.out.println("Domain: "+domain);

        }else System.out.println(email);
        input.close();
    }
}
