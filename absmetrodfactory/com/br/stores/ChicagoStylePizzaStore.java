package absmetrodfactory.com.br.stores;

import absmetrodfactory.com.br.factory.ChicagoPizzaIngredientFactory;
import absmetrodfactory.com.br.factory.PizzaIngredientFactory;
import absmetrodfactory.com.br.pizzas.CheesePizza;
import absmetrodfactory.com.br.pizzas.ClamPizza;
import absmetrodfactory.com.br.pizzas.PepperoniPizza;
import absmetrodfactory.com.br.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equalsIgnoreCase("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago style cheese pizza!");
        }
        else if(type.equalsIgnoreCase("pepperoni")){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago style pepperoni pizza!");
        }
        else if(type.equalsIgnoreCase("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style clam pizza!");
        }
        else if(type.equalsIgnoreCase("veggie")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago style veggie pizza!");
        }
        return pizza;
    }
}
