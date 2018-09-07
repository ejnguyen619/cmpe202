

public class Main {

  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5);

    System.out.println(gumballMachine);

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);

    gumballMachine.insertCoin();
    gumballMachine.turnCrank();
    gumballMachine.insertCoin();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);
  }
}