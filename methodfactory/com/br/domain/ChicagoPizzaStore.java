package methodfactory.com.br.domain;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")){
            return new ChicagoStyleCheesePizza();
        }
        else if(type.equalsIgnoreCase("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }
        else if(type.equalsIgnoreCase("clam")){
            return new ChicagoStyleClamPizza();
        }
        return null;
    }
}

//parei pag 119