package absmetrodfactory.com.br.stores;

import absmetrodfactory.com.br.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza OrderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
