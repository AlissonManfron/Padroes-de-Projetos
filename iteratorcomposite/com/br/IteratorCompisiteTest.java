package iteratorcomposite.com.br;

import java.util.ArrayList;

public class IteratorCompisiteTest {
    public static void main(String[] args) {

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakFastItems = pancakeHouseMenu.getMenuItems();


        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lauchItems = dinerMenu.getMenuItems();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
