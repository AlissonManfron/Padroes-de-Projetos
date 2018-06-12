package simplefactory.com.br.domain;

public class PizzaStore {

    SimplePizzaFactory factory;

    public void setFactory(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza OrderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
