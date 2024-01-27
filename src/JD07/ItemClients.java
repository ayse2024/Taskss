package JD07;

public class ItemClients {
    public static void main(String[] args) {
        Item item1=new Item();
        Item item2=new Item();

        item1.itemName="Pencil";
        item1.unitPrice=5;
        item1.quantity=1000;
        item1.calcCost();
        System.out.println(item1.toString());

        item2.itemName="Laptop";
        item2.unitPrice=1000;
        item2.quantity=8;

        item2.calcCost();
        System.out.println(item2.toString());
    }
}
