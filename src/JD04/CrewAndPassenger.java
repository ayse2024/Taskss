package JD04;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number=100;
        String result;
        result=(number==50)?"20 crew,30 passengers":(number==75)?"25 crew, 50 passengers":
                (number==100)?"30 crew, 70 passengers":"Invalid";
        System.out.println(result);

    }
}
