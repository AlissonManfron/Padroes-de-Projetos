package decoretor.com.br.domain.decorators;

import decoretor.com.br.domain.CondimentDecorator;
import decoretor.com.br.domain.beverages.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return .25 + beverage.cost();
    }
}
