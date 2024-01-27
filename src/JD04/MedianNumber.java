package JD04;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=12;
        if ((a>b && a<c) || (a>c && a<b)){
            System.out.println(a+" is median" );
        } else if((b>c && b<a) || (b>a && b<c)){
            System.out.println(b+ " is median" );
        }else
            System.out.println(c+ " is median");
    }
}
