package S04Inherit;

public class Main {

    public static void main(String[] args) {
        Wool wool1 = new Wool(0, 0, 0, 5, "pink");
        Wool wool2 = new Wool(0, 0, 1, 10, "red");

        System.out.println(wool1);

        wool1.setColor("yellow");
        wool1.setHardness(3);

        System.out.println(wool1 + "\n");

        System.out.println(wool2);

        wool2.setColor("gray");
        wool2.setHardness(15);

        System.out.println(wool2);
    }
}
