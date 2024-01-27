package JD06;

public class MathUtility {
    public static void main(String[] args) {
        int total=calculate(10,20,'+');
        System.out.println("total = " + total);
        int num=cube(3);
        System.out.println(num);
        double num2=square(1.5);
        System.out.println(num2);
    }
    public static int calculate(int num1,int num2,char operator){
        int result=0;
        switch (operator){
            case '+'-> result=num1+num2;
            case '-'-> result=num1-num2;
            case '/'-> result=num1/num2;
            case '*'-> result=num1*num2;
            default -> result=0;}
            return result;

    }
    public static double calculate(double num1,double num2,char operator){
        double result=0;
        switch (operator){
            case '+'-> result=num1+num2;
            case '-'-> result=num1-num2;
            case '/'-> result=num1/num2;
            case '*'-> result=num1*num2;
            default -> result=0;}
        return result;

    }
    public static int square(int num){
        return num*num;
    }

    public static double square(double num){
        return num*num;
    }

    public static int cube(int num){
        return square(num)*num;
    }
    public static double cube(double num){
        return square(num)*num;

}}
