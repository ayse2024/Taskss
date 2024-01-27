package JD04;

public class AgeGroups {
    public static void main(String[] args) {
        int age=-5;
        String result;
        result=(age >=0 && age<=20)?"Teenager":(age >=21 && age <=55)?"Adult":
                (age>=55 && age<150)?"Senior":"Invalid";
        System.out.println("result = " + result);


    }
}
