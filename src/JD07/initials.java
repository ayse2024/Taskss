package JD07;

public class initials {
    public static void main(String[] args) {
        String name = " chuck norris ";
        name = name.toUpperCase();
        name = name.charAt(1) + "." + name.charAt(7) + ".";

        System.out.println("name = " + name);
    }
}
