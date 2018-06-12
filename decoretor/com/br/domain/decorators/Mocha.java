package decoretor.com.br.domain.decorators;

import decoretor.com.br.domain.beverages.Beverage;
import decoretor.com.br.domain.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
