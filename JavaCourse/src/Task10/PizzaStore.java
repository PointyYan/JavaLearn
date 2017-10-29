package Task10;

public class PizzaStore {

    private SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();

    public Pizza prderPizza(String type) {
        return pizzaFactory.createPizza(type);
    }
}
