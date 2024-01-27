package JD07;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= scanner.nextInt();
        System.out.println("Enter your gender: ");
        char gender=scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println("Enter your full name: ");
        String name=scanner.nextLine();
        System.out.println("Enter your phone number: ");
        long phoneNumber= scanner.nextLong();
        System.out.println("Enter your zip code: ");
        int zipCode= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your School name: ");
        String schoolName= scanner.nextLine();
        System.out.println("Enter your city name: ");
        String cityName=scanner.nextLine();
                System.out.println("Enter your state name: ");
        String stateName= scanner.next();
        System.out.println("Enter your building number: ");
        int bnumber= scanner.nextInt();
        System.out.println("Enter your street name: ");
        String stname=scanner.nextLine();
        scanner.close();


        System.out.println("Full name: " + name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone number: " +phoneNumber);
        System.out.println("Address: \n\t"+bnumber+" "+stname+"\n\t"+cityName+", "+stateName+" "+zipCode);
        System.out.println("School name: "+schoolName);


    }
}
