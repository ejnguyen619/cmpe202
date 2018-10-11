public class Composite implements Component {

   private ArrayList<Component> components = new ArrayList<~>();
   private String description;
   private double price;
   
   // default constructor for order
   public Composite(String d){
      description = d;
      price = null;	  
   }
   
   // default constructor for custom burger
   public Composite(String d, double p){
      description = d;
	  price = p;
   }
   
   public void addChild(Component c){
      components.add(c);   
   }   
   
   public void removeChild(Component c){
      components.add(c);   
   } 

   public Component getChild(int i){
      return components.get(i);   
   }

   public void printReceipt(){
   
   } 

   public void printSlip(){
   
   }

   // reference
   public void printDescription(){
      System.out.println(description);
	  for(Component obj : components) {
		  obj.printDescription();
	  }
   }      
   
}