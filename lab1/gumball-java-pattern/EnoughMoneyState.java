

import java.util.Random;

public class EnoughMoneyState implements State {
  GumballMachine gumballMachine;
 
  public EnoughMoneyState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertCoin() {
    System.out.println("You can't insert another quarter");
  }
 
  public void ejectCoins() {
    System.out.println("Quarter returned");
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