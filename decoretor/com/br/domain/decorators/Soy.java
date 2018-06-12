package decoretor.com.br.domain.decorators;

import decoretor.com.br.domain.CondimentDecorator;
import decoretor.com.br.domain.beverages.Beverage;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Soy";
    }

    @Override
    public double cost() {
        return .30 + beverage.cost();
    }
}
