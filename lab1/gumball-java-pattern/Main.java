

public class Main {

  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5,3);

    System.out.println(gumballMachine);

    gumballMachine.insertCoin(10);
    gumballMachine.turnCrank();
    gumballMachine.ejectCoins();

    System.out.println(gumballMachine);

    gumballMachine.insertCoin(25);
    gumballMachine.turnCrank();
    gumballMachine.insertCoin(25);
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);
  }
}