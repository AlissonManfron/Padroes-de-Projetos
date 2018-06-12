package decoretor.com.br.domain.test;

import decoretor.com.br.domain.beverages.Beverage;
import decoretor.com.br.domain.beverages.DarkRoast;
import decoretor.com.br.domain.beverages.Expresso;
import decoretor.com.br.domain.beverages_sizes.Grande;
import decoretor.com.br.domain.beverages_sizes.Venti;
import decoretor.com.br.domain.decorators.Mocha;
import decoretor.com.br.domain.decorators.Soy;
import decoretor.com.br.domain.beverages_sizes.Tall;
import decoretor.com.br.domain.decorators.Whip;

public class StarbuzzCoffeeTest {

    public static void main(String[] args) {

        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription()+ " $"+ darkRoast.cost());
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        darkRoast = new Whip(darkRoast);
        darkRoast = new Venti(darkRoast);
        System.out.println(darkRoast.getDescription()+ " $"+ darkRoast.cost());

        System.out.println("");

        Beverage expresso = new Expresso();
        System.out.println(expresso.getDescription()+ " $"+ expresso.cost());
        expresso = new Mocha(expresso);
        expresso = new Mocha(expresso);
        expresso = new Soy(expresso);
        expresso = new Whip(expresso);
        expresso = new Tall(expresso);
        System.out.println(expresso.getDescription()+ " $"+ expresso.cost());
        System.out.println("");



    }
}
