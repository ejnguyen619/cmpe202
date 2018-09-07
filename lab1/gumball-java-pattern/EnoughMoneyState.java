

import java.util.Random;

public class EnoughMoneyState implements State {
  GumballMachine gumballMachine;
 
  public EnoughMoneyState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertCoin() {
    if (gumballMachine.getModelNumber() == 1 || gumballMachine.getModelNumber() == 2 ) {
      System.out.println("You can't insert another quarter");
    }
    else {
      System.out.println("Total value exceed minimum cost.");
    }
  }
 
  public void ejectCoins() {
    gumballMachine.resetCurrentCost();
    System.out.println("Your money has been returned");
    gumballMachine.setState(gumballMachine.getNotEnoughMoneyState());
  }
 
  public void turnCrank() {
    System.out.println("You turned...");
    gumballMachine.setState(gumballMachine.getSoldState());
  }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
  public String toString() {
    return "waiting for turn of crank";
  }
}