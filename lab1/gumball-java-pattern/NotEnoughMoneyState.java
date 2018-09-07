

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
  public void insertCoin() {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getEnoughMoneyState());
  }
 
  public void ejectCoins() {
    System.out.println("You haven't inserted a quarter");
  }
 
  public void turnCrank() {
    System.out.println("You turned, but there's no quarter");
   }
 
  public void dispense() {
    System.out.println("You need to pay first");
  } 
 
  public String toString() {
    return "waiting for quarter";
  }
}