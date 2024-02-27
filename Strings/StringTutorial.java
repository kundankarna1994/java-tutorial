package Strings;

public class StringTutorial {
    public static void main(String[] args) {
        // Using new
        String city = new String("Kathmandu");

        // Here String is a class and it will automatically creates an object for us.
        String name = "Kundan";

        System.out.println(name + " : " + city);

        System.out.println(name.hashCode());

        // Get length of string
        System.out.println(name.length());

        // uppercase
        System.out.println(name.toUpperCase());

    }
}
