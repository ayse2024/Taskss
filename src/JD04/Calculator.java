package JD04;

public class Calculator {
    public static void main(String[] args) {
        double n1=10;
        double n2=20;
        double result=0;
        char mathOperator='-';
        switch (mathOperator){
            case'+': result=n1+n2;break;
            case'-': result=(n1-n2);break;
            case'*': result=(n1*n2);break;
            case'/': result=(n1/n2);break;
            default:
                System.out.println("Invalid operator ");

        }
        System.out.println(result);
    }
}
