package JD07;

import java.util.Scanner;

public class CentToDollars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the cents: ");
        int cents=input.nextInt();
        int dollar=cents/100;
        int rcent=cents%100;
        System.out.println(cents+" cents is equal to "+dollar+ " dollars and " +rcent +" cents" );
        input.close();


    }
}
