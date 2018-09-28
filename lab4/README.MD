1. CRC Cards:

       Class Name Restaurant             
       Responsibilities:				                                     
         Add customer to waitlist                         
         Remove customer from waitlist                  
         Notify customer if available
       Collaborators: None		 

     |  Class Name Waitlist             | Collaborators   |
     |  ------------------------------  | Restaurant      |
     |  Responsibilities                | WaitStatus      |
	 |	  Get customer ready for table	| Table           |
	 |	  Check if available table		| Customer        |
	 |    Set customer ready for table  |                 |
	 |    Show customer ready for table |                 |
	 
      ----------------------------------------------------
     |  Class Name Table                | Collaborators   |
     |  ------------------------------  |                 |
     |  Responsibilities                |                 |
     |    Get status of selected table  |                 |
     |    Get number of seats on table  |                 |
     |	  Set table as open or filled   |                 |
	  ----------------------------------------------------

      ----------------------------------------------------
     |  Class Name Customer             | Collaborators   |
     |  ------------------------------  |                 |
     |  Responsibilities                |                 |
     |    Stop sending messages         |                 |
     |    Confirm reservation           |                 |
     |    Leave waitlist                |                 |
      ----------------------------------------------------

      ----------------------------------------------------
     |  Class Name WaitStatus           | Collaborators   |
     |  ------------------------------  | Waitlist        |
     |  Responsibilities                | Customer        |
     |    Show State of Customer        |                 |
      ----------------------------------------------------

      ----------------------------------------------------
     |  Class Name Waiting              | Collaborators   |
     |  ------------------------------  | WaitStatus      |
     |  Responsibilities                |                 |
     |    Stop sending messages         |                 |
      ----------------------------------------------------

      ----------------------------------------------------
     |  Class Name Available            | Collaborators   |
     |  ------------------------------  | WaitStatus      |
     |  Responsibilities                |                 |
     |    Confirm reservation           |                 |
     |    Leave waitlist                |                 |
      ----------------------------------------------------
 
 2. Explanation:
	The design pattern used are Observer and State. 
	Observer is used because we need a way for a customer to be notified when there's a change in the waitlist.
    While Observer is used for broadcasting, there may be cases of long period of waiting with no response from the customer.
    State is used because the behavior of the customer object depends on its state.
    There are many options that the customer can choose that affect its state.

    Observer:
	-Subject (Interface): Restaurant
	-Observer (Interface): Customer
	-ConcreteSubject: Waitlist
	-ConcreteObserver: WaitStatus
	
	State:
	-Context (Interface): Waitlist
	-State (Interface): Customer
	-ConcreteState subclasses: Waiting, Available