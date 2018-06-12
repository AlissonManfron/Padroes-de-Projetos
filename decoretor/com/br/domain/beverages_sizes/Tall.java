package decoretor.com.br.domain.beverages_sizes;

import decoretor.com.br.domain.SizeDecorator;
import decoretor.com.br.domain.beverages.Beverage;

public class Tall extends SizeDecorator {

    private Beverage beverage;

    public Tall(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Tall";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost() ;
    }
}
