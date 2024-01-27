package JD08;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?");
        String yesOrNo = scanner.next().toLowerCase();

        System.out.println("Enter the number of people:");
        int numOfPeople = scanner.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scanner.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor)");
        String service = scanner.next().toLowerCase();

        double tipRate = (service.equals("excellent")) ? 0.25 :
                         (service.equals("great")) ? 0.2:
                         (service.equals("good")) ? 0.15 :
                         (service.equals("fair")) ? 0.1 : 0.05;

        double totalTip = amount * tipRate;

        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + amount);
        System.out.println("Total tip: " + totalTip);

        if (yesOrNo.equals("yes")) {
            System.out.println("Total per person: " + (amount / numOfPeople));
            System.out.println("Tip per person: " + (totalTip / numOfPeople));
        }

        scanner.close();

    }
}



