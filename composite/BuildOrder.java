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


        /// USING DECORATOR TO CREATE CUSTOM BURGER
        Composite customBurger2 = new CustomBurger("Build Your Own Burger");

        Decorator b = new Burger("Burger");
        String[] burgerOptions = new String[]{"1/3 lb" , "On a Bun", "Beef"};
        b.setOptions(burgerOptions);

        Decorator c = new Cheese("Cheese");
        String[] cheeseOptions = new String[]{"Danish Blue Cheese", "Horseradish Cheddar"};
        c.setOptions(cheeseOptions);

        Decorator t = new Toppings("Toppings");
        String[] toppingOptions = new String[]{"Bermuda Red Onion", "Black Olives", "Carrot Strings", "Coleslaw"};
        t.setOptions(toppingOptions);

        Decorator p = new Premium("Premium");
        String[] premiumOptions = new String[]{"Applewood Smoked Bacon"};
        p.setOptions(premiumOptions);

        Decorator s = new Sauce("Sauce");
        String[] sauceOptions = new String[]{"Appricot Sauce"};
        s.setOptions(sauceOptions);

        customBurger2.addChild(b);
        customBurger2.addChild(c);
        customBurger2.addChild(t);
        customBurger2.addChild(p);
        customBurger2.addChild(s);

        order.addChild(customBurger2);

        return order ;
    }

}


/*
Counter Burger Menu:
https://www.thecounter.com/menu/index.php
*/
