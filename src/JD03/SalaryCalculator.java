package JD03;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate=50;
        int weeklyHours=45;
        double stateTaxRate=6;
        double federalTaxRate=26;
        double totalpay=hourlyRate*weeklyHours*52;
        double ftax=totalpay*(federalTaxRate/100);
        double stax=totalpay*(stateTaxRate/100);

        System.out.println("Gross pay is: $" + (totalpay) );
        System.out.println("Federal tax is: $"+ftax );
        System.out.println("State tax is: $" + stax);
        System.out.println("Total tax is: $" +(ftax+stax) );
        System.out.println("Net income is: $" + (totalpay-(ftax+stax)));

    }
}
