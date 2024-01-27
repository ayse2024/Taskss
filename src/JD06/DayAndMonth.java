package JD06;

public class DayAndMonth {
    public static void main(String[] args) {
        System.out.println(day(4));
        System.out.println(monthName(8));
        daysInMonth(4);
    }

    public static String day(int dayNum) {
        String result = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Number";
        };
        return result;
    }
    public static String monthName(int monthNum) {
        String result = switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Number";
        };
        return result;
    }
    public static void daysInMonth(int month) {
        switch (month) {
            case 2:
                System.out.println("28 days");
                break;
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month");
        }

    }

}


//4. Create a class named DayAndMonth:
//
//	3.1 Create a method named day that displays the day's name based on the given number.
//	If the number is invalid, print "Invalid Number".
//
//			Example:
//				day(5);
//
//			Output:
//				Friday
//
//	3.2 Create a method named monthName that displays the month's name based on the given number.
//	If the number is invalid, print "Invalid Number."
//
//
//			Example:
//				monthName(6);
//
//			Output:
//				June
//
//	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
//	If the number is invalid, print "Invalid Number."
//
//				Example:
//					daysInMonth(6);
//
//				Output:
//					June has 30 days