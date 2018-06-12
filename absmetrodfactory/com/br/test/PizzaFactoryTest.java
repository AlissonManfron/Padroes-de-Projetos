package absmetrodfactory.com.br.test;

import absmetrodfactory.com.br.stores.ChicagoStylePizzaStore;
import absmetrodfactory.com.br.stores.NYStylePizzaStore;
import absmetrodfactory.com.br.pizzas.Pizza;
import absmetrodfactory.com.br.stores.PizzaStore;

public class PizzaFactoryTest {
    public static void main(String[] args) {

        PizzaStore nyPizzaStore = new NYStylePizzaStore();

        Pizza pizza = nyPizzaStore.OrderPizza("cheese");
        System.out.println("Joel ordered a  "+ pizza.getName());

        System.out.println("");

        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        Pizza pizza1 = chicagoStylePizzaStore.OrderPizza("clam");
        System.out.println("Peter ordered a  "+ pizza1.getName());

    }
}
