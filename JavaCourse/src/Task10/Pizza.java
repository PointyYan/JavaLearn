package Task10;

import java.util.ArrayList;

public class Pizza {
    String name;

    Pizza() {
        name = "Pizza";
        String dough = "Normal";
        String sauce = "Spice";
        ArrayList<String> toppings = new ArrayList<>();
    }

    void prepare() {
        System.out.println("prepare");
    }

    void bake() {
        System.out.println("bake");
    }

    void cut() {
        System.out.println("cut");
    }

    void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }
}
