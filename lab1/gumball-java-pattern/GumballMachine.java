

public class GumballMachine {
 
  State soldOutState;
  State notEnoughMoneyState;
  State enoughMoneyState;
  State soldState;
 
  State state = soldOutState;
  int count = 0;
  int cur_cost;
  int min_cost;
  int model_num;
  int cur_coin;

  boolean accept_quarter;
  boolean accept_dime;
  boolean accept_nickel;
  boolean accept_penny;
 
  public GumballMachine(int numberGumballs, int type) {
    soldOutState = new SoldOutState(this);
    notEnoughMoneyState = new NotEnoughMoneyState(this);
    enoughMoneyState = new EnoughMoneyState(this);
    soldState = new SoldState(this);

    this.count = numberGumballs;
    if (numberGumballs > 0) {
      state = notEnoughMoneyState;
    }

    // type number correspond with type of gumball machine:
    // 1: Single Quarter Machine
    // 2: Two Quarters Machine
    // 3: Slot Machine
    switch (type)
    {
      case 1:
        coinAllow(true,false,false,false);
        this.min_cost = 25;
        break;
      case 2:
        coinAllow(true,false,false,false);
        this.min_cost = 50;
        break;
      case 3:
        coinAllow(true,true,true,true);
        this.min_cost = 50;
        break;  
    }
    this.cur_cost = 0;
    this.model_num = type; 
  }
 
  // Check what coins are accepted in a particular gumball machine
  public void coinAllow (boolean quarter, boolean dime, boolean nickel, boolean penny)
  {
    this.accept_quarter = quarter;
    this.accept_dime = dime;
    this.accept_nickel = nickel;
    this.accept_penny = penny;
  }

  public void insertCoin(int coin) {
    if (checkCoin(coin)) {
      this.cur_coin = coin;
      state.insertCoin();
    }
    else
      System.out.println("Coin cannot be inserted");
  }

  public boolean checkCoin(int coin) {
    boolean accept_coin = false;
    switch(coin) {
      case 25:
        accept_coin = this.accept_quarter;
        break;
      case 10:
        accept_coin = this.accept_dime;
        break;
      case 5:
        accept_coin = this.accept_nickel;
        break;
      case 1:
        accept_coin = this.accept_penny;
        break;
    }
    return accept_coin;
  }
 
  public void ejectCoins() {
    state.ejectCoins();
  }
 
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  void setState(State state) {
    this.state = state;
  }

  void setCurrentCost(int coin) {
    this.cur_cost += coin;
  }

  void resetCurrentCost() {
    this.cur_cost = 0;
  }
 
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count - 1;
    }
  }
 
  int getCount() {
    return count;
  }

  int getCurrentCost() {
    return cur_cost;
  }

  int getMinCost() {
    return min_cost;
  }

  int getModelNumber() {
    return model_num;
  }

  int getCurrentCoin() {
    return cur_coin;
  } 

  boolean getAcceptQuarter() {
    return accept_quarter;
  }

  boolean getAcceptDime() {
    return accept_dime;
  }

  boolean getAcceptNickel() {
    return accept_nickel;
  }

  boolean getAcceptPenny() {
    return accept_penny;
  }
 
  void refill(int count) {
    this.count = count;
    state = notEnoughMoneyState;
  }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughMoneyState() {
        return notEnoughMoneyState;
    }

    public State getEnoughMoneyState() {
        return enoughMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }
 
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("\nMighty Gumball, Inc.");
    result.append("\nJava-enabled Standing Gumball Model #2004");
    result.append("\nInventory: " + count + " gumball");
    if (count != 1) {
      result.append("s");
    }
    result.append("\n");
    result.append("Machine is " + state + "\n");
    return result.toString();
  }
}