public interface Component {

   void printReceipt();
   void printSlip();
   void printDescription();
   void addChild(Component c);
   void removeChild(Component c);
   Component getChild(int i);
}