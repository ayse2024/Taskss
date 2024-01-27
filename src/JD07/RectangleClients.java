package JD07;

public class RectangleClients {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle();
        r1.width=10;
        r1.length=20;
        r2.width=3;
        r2.length=5;
        System.out.println(r1.calculateAres());
        System.out.println(r1.calculatePerimeter());
        System.out.println(r1.toString());

        System.out.println(r2.calculateAres());
        System.out.println(r2.calculatePerimeter());
        System.out.println(r2.toString());

    }
}
