package JD08;

import java.util.Scanner;

public class FirstLastName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first name: ");
        String firstname= scanner.next().toLowerCase();
        System.out.print("Enter last name: ");
        String lastname=scanner.next().toLowerCase();
        scanner.close();
        char firstch=firstname.charAt(0);
        char upperfirstch=Character.toUpperCase(firstch);
        String fname=firstname.replace(firstname.charAt(0),upperfirstch);

        char firstch2=lastname.charAt(0);
        char upperfirstch2=Character.toUpperCase(firstch2);
        String lname=lastname.replace(lastname.charAt(0),upperfirstch2);
        System.out.print(fname+" "+lname);

    }
}
