public interface Component {

   void printReceipt();
   void PrintSlip();
   void addChild(Component c);
   void removeChild(Component c);
   Component getChild(int i);
}