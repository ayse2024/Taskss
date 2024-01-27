package JD07;

public class AddressClients {
    public static void main(String[] args) {
        Address a1=new Address();
        Address a2=new Address();

        a1.buildingNumber=7925;
        a1.street="Jonas Branch Dr";
        a1.city="Mclean";
        a1.state="VA";
        a1.zipCode=22012;

        System.out.println(a1.toString());
    }
}
