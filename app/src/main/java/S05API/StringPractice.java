package S05API;

public class StringPractice {

    public static void main(String[] args) {

        String state1 = "California";
        String state2 = "california";
        String city = "Rancho Santa Margarita";

        System.out.println("States equal: " + state1.equals(state2));
        System.out.println("Diffrence amount: " + state1.compareTo(state2));
        System.out.println("Lenght of city name: " + city.length());
        System.out.println("Index of Margarita: " + city.indexOf("Margarita"));
        System.out.println("Substring starting from 7 of city: " + city.substring(7));
        System.out.println("Uppercase state2: " + state2.toUpperCase());
    }
}
