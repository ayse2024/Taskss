package JD07;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r=input.nextDouble();
        System.out.println("The area of Circle is "+(3.14*r*r));
        System.out.println("The perimeter of Circle is "+ (2*3.14*r));
        input.close();
    }
}
