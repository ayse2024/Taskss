package JD07;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your score:");
        int score=input.nextInt();
        char grade=' ';
        if (score>=90 && score<=100){grade='A';}
        else if (score>=80 && score<=89){grade='B';}
        else if (score>=60 && score<=79){grade='C';}
        else if (score>=40 && score<=59){grade='D';}
        else if (score>=0 && score<=39){grade='E';}
        else {
            System.out.println("Invalid Score");
            return;}

        System.out.println("Your grade is "+ grade);
        input.close();


    }
}
