package methodfactory.com.br.domain;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("cheese")){
            return new CheesePizza();
        }
        else if(type.equalsIgnoreCase("pepperoni")){
            return new PepperoniPizza();
        }
        else if(type.equalsIgnoreCase("clam")){
            return new ClamPizza();
        }
        return null;
    }
}
