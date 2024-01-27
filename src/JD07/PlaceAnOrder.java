package JD07;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the product name:");
        String pname= scanner.nextLine();

        System.out.print("Enter the price:");
        double p=scanner.nextDouble();

        System.out.print("Enter the quantity:");
        int q=scanner.nextInt();

        System.out.print("Enter the your first name:");
        String firstname=scanner.next();

        System.out.println(firstname+", your order for "+q+" "+pname+" has been placed.Your total is "+ (p*q)+".");
    }
}
