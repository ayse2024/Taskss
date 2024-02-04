package JD09;

import java.util.Arrays;

public class Items {
    public static void main(String[] args) {
        String [] items={"Shoes","Jacket","Gloves","Airpods","iPad","iPhone 12 case"};
        double [] prices={99.99,150.0,9.99,250.0,439.50,39.99};
        int [] itemIDs={12345,12346,12347,12348,12349,12350};
        int indexNumOfGloves = 0;
        boolean hasIPad = false;
        String report = "";

        for (int i = 0; i < items.length; i++) {
            String itemName = items[i];
            double itemPrice = prices[i];
            int itemID = itemIDs[i];

            if (itemName.equals("Gloves")) {
                indexNumOfGloves = i;
            }

            if (itemName.equals("iPad")) {
                hasIPad = true;
            }

            report += itemName + " - " + itemPrice + " - #" + itemID + "\n";


        }
        System.out.println("Index Number of Gloves= "+indexNumOfGloves);
        System.out.println("Has Ipad?= "+ hasIPad);
        System.out.println(report);

    }

}
