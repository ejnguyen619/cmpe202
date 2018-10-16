  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/2 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // premium cheese +1.50
        PremiumCheese pc = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco = {"Danish Blue Cheese"};
        pc.setOptions( pco );
        pc.wrapDecorator( c );
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // unlimited toppings
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.00 or +3.00
        PremiumToppings pt = new PremiumToppings( "Premium Options" ) ;
        String[] pto = { "Marinated Tomatoes" } ;
        pt.setOptions( pto ) ;
        pt.wrapDecorator( t ) ;
        // Choose a Bun
        Bun bu = new Bun ("Bun Options");
        String[] buo = { "Ciabatta (Vegan)" };
        bu.setOptions( buo ) ;
        bu.wrapDecorator( pt ) ;
        // Choose a Side
        Side si = new Side ("Side Options");
        String[] sio = { "Shoestring Fries" };
        si.setOptions( sio ) ;
        si.wrapDecorator( bu ) ;
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;        
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( pt ) ;
        customBurger.addChild( bu ) ;
        customBurger.addChild( si ) ;       
        
        // Add Custom Burger to the Order
        order.addChild( customBurger );

        // Custom Burger 2
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        // premium cheese +1.50
        PremiumCheese pc2 = new PremiumCheese( "Premium Cheese Options" ) ;
        String[] pco2 = {"Fresh Mozzarella"};
        pc2.setOptions( pco2 );
        pc2.wrapDecorator( c2 );
        // 1 sauce free, extra +.50
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        // unlimited toppings
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // premium topping +1.00 or +3.00
        PremiumToppings pt2 = new PremiumToppings( "Premium Options" ) ;
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        pt2.setOptions( pto2 ) ;
        pt2.wrapDecorator( t2 ) ;
        // Choose a Bun
        Bun bu2 = new Bun ("Bun Options");
        String[] buo2 = { "Gluten-Free Bun" };
        bu2.setOptions( buo2 ) ;
        bu2.wrapDecorator( pt2 ) ;
        // Choose a Side
        Side si2 = new Side ("Side Options");
        String[] sio2 = { "Shoestring Fries" };
        si2.setOptions( sio2 ) ;
        si2.wrapDecorator( bu2 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( si2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;        
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( pt2 ) ;
        customBurger2.addChild( bu2 ) ;
        customBurger2.addChild( si2 ) ;       
        
        // Add Custom Burger to the Order
        order.addChild( customBurger2 );
        return order ;
    }

}


/*
Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square
*/