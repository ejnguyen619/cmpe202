

public class Main {

  public static void main(String[] args) {
    GumballMachine gumballMachine = new GumballMachine(1,1);
    GumballMachine gumballMachine2 = new GumballMachine(5,2);
    GumballMachine gumballMachine3 = new GumballMachine(5,3);

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

    System.out.println();

    System.out.println(gumballMachine3);

    gumballMachine3.turnCrank();

    gumballMachine3.insertCoin( 10 );
    gumballMachine3.insertCoin( 5 );

    gumballMachine3.turnCrank();

    gumballMachine3.insertCoin( 25 );
    gumballMachine3.insertCoin( 25 );

    gumballMachine3.turnCrank();

  }
}