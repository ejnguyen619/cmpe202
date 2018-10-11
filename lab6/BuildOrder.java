public class BuildOrder {

   public static Component getOrder(){
	   Composite order = new Composite("Order");

       // List Custom Burger and toppings	   
	   Composite customBurger = new Composite("LBB", 5.59);
	   customBurger.addChild(new Leaf("BACON", "Bottom"));
	   customBurger.addChild(new Leaf("LETTUCE", "Top"));
	   customBurger.addChild(new Leaf("TOMATO", "Top"));
	   customBurger.addChild(new Leaf("G ONION", "Meat"));
	   customBurger.addChild(new Leaf("JALA Grilled", "Meat"));
	   order.addChild(customBurger);
	   
	   // List sides
	   order.addChild(new Leaf("LTL CAJ", 2.79));
	   return order;
   }    

}