package simplefactory.com.br.test;

import simplefactory.com.br.domain.Pizza;
import simplefactory.com.br.domain.PizzaStore;
import simplefactory.com.br.domain.SimplePizzaFactory;

public class PizzaFactoryTest {
    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore pizzaStore = new PizzaStore();

        pizzaStore.setFactory(factory);

        Pizza pizza = pizzaStore.OrderPizza("cheese");
        System.out.println("Joel ordered a  "+ pizza.getName());

    }
}
