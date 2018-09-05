public class GumballMachine
{

    private int num_gumballs;
    private int remain_cost;
    private int min_cost;

    public GumballMachine( int size, int cost )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.min_cost = cost;
        this.remain_cost = cost;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )  
            remain_cost -= 25;
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
          System.out.println( "No More Gumballs!  Sorry, no returns." ) ;
        }
      }
      else 
      {
        System.out.println( "Please insert " +remain_cost+ " cents.") ;
      }        
    }
}