package JD07;

public class Item {
    public String itemName;
    public double unitPrice;
    public int quantity;
    public double totalCost;
    public void calcCost(){
        totalCost=(unitPrice*quantity);
        System.out.println("Cost="+totalCost);
    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                 '\'' +
                '}';
    }

}
