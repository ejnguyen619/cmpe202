public class Leaf implements Component {

   private String description;
   pruvate String toppingspot;
   private double price;
   
   // default constructor for burger toppings
   public Leaf(String d, String t){
      description = d;
	  toppingspot = t;
	  price = 0.00;
   }   
   
   // default constructor for sides
   public Leaf(String d, double p){
      description = d;
	  toppingspot = null;
	  price = p;
   }
   
   public void printReceipt(){
   
   } 

   public void printSlip(){
   
   }

   // reference
   public void printDescription(){
      System.out.println(description + " " + price);
   }     
   
   public void addChild(Component c){
      // no implementation
   }   
   
   public void removeChild(Component c){
      // no implementation
   } 

   public Component getChild(int i){
      // no implementation
	  return null;
   }
   
}