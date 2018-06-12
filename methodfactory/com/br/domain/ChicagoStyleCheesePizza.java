package methodfactory.com.br.domain;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style deep cheese pizza";
        dough = "Extra trick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded mozzarella cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
