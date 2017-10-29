package Task10;

public class SimplePizzaFactory {
    public Pizza createPizza (String type) {
        Pizza pizza;
        switch (type) {
            case "Cheese":
            {
                pizza = new CheesePizza();
                break;
            }

            case "Veggie":
            {
                pizza = new VeggiePizza();
                break;
            }

            case "Clam":
            {
                pizza = new ClamPizza();
                break;
            }

            case "Pepperoni":{
                pizza = new PepperoniPizza();
                break;
            }

            default:{
                pizza = new Pizza();
                break;
            }
        }

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();

        return pizza;
    }
}
