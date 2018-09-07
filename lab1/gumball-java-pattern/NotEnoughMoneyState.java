

public class NotEnoughMoneyState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughMoneyState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
  public void insertCoin() {
    switch(gumballMachine.getCurrentCoin()) {
      case 25:
        System.out.println("You inserted a quarter");
        break;
      case 10:
        System.out.println("You inserted a dime");
        break;
      case 5:
        System.out.println("You inserted a nickel");
        break;
      case 1:
        System.out.println("You inserted a penny");
        break;
    }
    gumballMachine.setCurrentCost(gumballMachine.getCurrentCoin());
    System.out.println("Total value inserted: " +gumballMachine.getCurrentCost()+ " cents");
    if (gumballMachine.getCurrentCost() >= gumballMachine.getMinCost()) {
      gumballMachine.setState(gumballMachine.getEnoughMoneyState());
    }
  }
 
  public void ejectCoins() {
    if (gumballMachine.getCurrentCost() == 0) {
      System.out.println("You haven't inserted anything yet");
    }
    else {
      gumballMachine.resetCurrentCost();
      System.out.println("Your money has been returned");
    }
  }
 
  public void turnCrank() {
    if (gumballMachine.getCurrentCost() == 0) {
      System.out.println("You turned, but there's no coin");
    }
    else {
      System.out.println("You turned, but there's not enough coin(s)");
    }
   }
 
  public void dispense() {
    System.out.println("You need to pay the minimum cost first");
  } 
 
  public String toString() {
    return "waiting for coin(s)";
  }
}