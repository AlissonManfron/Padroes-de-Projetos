package decoretor.com.br.domain.beverages_sizes;

import decoretor.com.br.domain.SizeDecorator;
import decoretor.com.br.domain.beverages.Beverage;

public class Grande extends SizeDecorator {

    private Beverage beverage;

    public Grande(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Grande";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
