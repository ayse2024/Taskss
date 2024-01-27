package JD07;

public class Rectangle {
    public double width;
    public double length;
    public double calculateAres(){
        return length*width;
            }
    public double calculatePerimeter(){
        return 2*(length+width);
            }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }


}
