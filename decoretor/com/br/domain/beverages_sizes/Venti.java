package decoretor.com.br.domain.beverages_sizes;

import decoretor.com.br.domain.SizeDecorator;
import decoretor.com.br.domain.beverages.Beverage;

public class Venti extends SizeDecorator {

    private Beverage beverage;

    public Venti(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Venti";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
