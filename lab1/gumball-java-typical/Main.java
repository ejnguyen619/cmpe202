

public class Main {

  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(5,25);
    GumballMachine gumballMachine2 = new GumballMachine(5,50);

    System.out.println(gumballMachine);

    gumballMachine.turnCrank();
    
    gumballMachine.insertQuarter( 25 );
    gumballMachine.turnCrank();

    gumballMachine.insertQuarter( 25 );
    gumballMachine.insertQuarter( 25 );
    gumballMachine.turnCrank();

    System.out.println();

    System.out.println(gumballMachine2);

    gumballMachine2.turnCrank();

    gumballMachine2.insertQuarter( 25 );
    gumballMachine2.turnCrank();

    gumballMachine2.insertQuarter( 25 );
    gumballMachine2.turnCrank();
  }
}