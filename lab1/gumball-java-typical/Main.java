

public class Main {

  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5,1);
    GumballMachine gumballMachine2 = new GumballMachine(5,2);

    System.out.println(gumballMachine);

    gumballMachine.turnCrank();
    
    gumballMachine.insertCoin( 10 );

    gumballMachine.insertCoin( 25 );
    gumballMachine.turnCrank();

    gumballMachine.insertCoin( 25 );
    gumballMachine.insertCoin( 25 );
    gumballMachine.turnCrank();

    System.out.println();

    System.out.println(gumballMachine2);

    gumballMachine2.turnCrank();

    gumballMachine2.insertCoin( 25 );
    gumballMachine2.turnCrank();

    gumballMachine2.insertCoin( 25 );
    gumballMachine2.turnCrank();
  }
}