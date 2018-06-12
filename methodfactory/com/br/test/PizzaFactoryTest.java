package methodfactory.com.br.test;

import methodfactory.com.br.domain.ChicagoPizzaStore;
import methodfactory.com.br.domain.Pizza;
import methodfactory.com.br.domain.PizzaStore;

public class PizzaFactoryTest {
    public static void main(String[] args) {

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = chicagoPizzaStore.OrderPizza("cheese");
        System.out.println("Joel ordered a  "+ pizza.getName());

    }
}
