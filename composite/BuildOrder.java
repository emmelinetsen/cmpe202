public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        Composite customBurger = new Composite( "Build Your Own Burger" ) ;
        customBurger.addChild(new Leaf("Beef, 1/3 lb on a Bun", 9.50 )); // base price for 1/3 lb
        customBurger.addChild(new Leaf("Danish Blue Cheese", 0.00 )); // 1 cheese free, extra cheese +1.00
        customBurger.addChild(new Leaf("Horseradish Cheddar", 1.00 )); // extra cheese +1.00
        customBurger.addChild(new Leaf("Bermuda Red Onion", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Black Olives", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Carrot Strings", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Coleslaw", 0.00 )); // 4 toppings free, extra +.75
        customBurger.addChild(new Leaf("Applewood Smoked Bacon", 1.50 )); // premium topping +1.50
        customBurger.addChild(new Leaf("Appricot Sauce", 0.00 )); // 1 sauce free, extra +.75
        //order.addChild( customBurger );

        /// USING DECORATOR
        Composite customBurger2 = new CustomBurger("Build Your Own Burger");

        Decorator d = new Burger("Burger Options");
        String[] o = new String[]{"1/3 lb on a Bun", "Beef"};
        d.setOptions(o);

        Decorator c = new Cheese("Cheese");
        String[] o1 = new String[]{"Cheese", "Gouda"};
        c.setOptions(o1);

        customBurger2.addChild(d);
        customBurger2.addChild(c);

        order.addChild(customBurger2);

        return order ;
    }

}


/*
Counter Burger Menu:
https://www.thecounter.com/menu/index.php
*/
