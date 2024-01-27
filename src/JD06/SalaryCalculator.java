package JD06;
public class SalaryCalculator {
    public static void main(String[] args) {
        double income = salary(45, 40);
        System.out.println(income);

    }

    public static double salary(double hourlyRate, int weeklyHours) {
        double total = hourlyRate * weeklyHours * 52;
        return total;

    }

}

//Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
//and weekly hours (int) and returns the salary.
//
//			Example:
//				double income = salary(45, 40);
//
//			Output:
//				93600.0

