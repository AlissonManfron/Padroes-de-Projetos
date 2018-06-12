package absmetrodfactory.com.br.stores;

import absmetrodfactory.com.br.factory.NYPizzaIngredientFactory;
import absmetrodfactory.com.br.factory.PizzaIngredientFactory;
import absmetrodfactory.com.br.pizzas.*;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York style cheese pizza!");
        }
        else if(type.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York style pepperoni pizza!");
        }
        else if(type.equalsIgnoreCase("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York style clam pizza!");
        }
        else if(type.equalsIgnoreCase("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York style veggie pizza!");
        }
        return pizza;
    }
}
