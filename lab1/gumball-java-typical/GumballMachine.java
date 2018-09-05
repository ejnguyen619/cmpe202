public class GumballMachine
{

    private int num_gumballs;
    private int remain_cost;
    private int min_cost;
    private boolean accept_quarter;
    private boolean accept_dime;
    private boolean accept_nickel;
    private boolean accept_penny;

    public GumballMachine( int size, int type )
    {
        // initialise instance variables
        this.num_gumballs = size;

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
        this.remain_cost = this.min_cost;
    }

    // Check what coins are accepted in a particular gumball machine
    public void coinAllow (boolean quarter, boolean dime, boolean nickel, boolean penny)
    {
        this.accept_quarter = quarter;
        this.accept_dime = dime;
        this.accept_nickel = nickel;
        this.accept_penny = penny;
    }

    public void insertCoin(int coin)
    {
        if ( checkCoin(coin) == true )
        {        
            this.remain_cost -= coin;
        }
        else
            System.out.println("This coin is not accepted. Try again.");
    }

    public boolean checkCoin(int coin)
    {
        boolean accept_coin = false;
        switch(coin)
        {
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
    
    public void turnCrank()
    {
      if ( this.remain_cost <= 0 )
      {
        if ( this.num_gumballs > 0 )
        {
          this.num_gumballs-- ;
          this.remain_cost = this.min_cost ;
          System.out.println( "Thank you. Gumball Ejected!" ) ;
        }
        else
        {
          System.out.println( "No More Gumballs! Sorry, no returns." ) ;
        }
      }
      else 
      {
        System.out.println( "Please insert " +this.remain_cost+ " cents.") ;
      }        
    }
}