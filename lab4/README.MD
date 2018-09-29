1. CRC Cards:

       Class Name Restaurant             
       Responsibilities:				                                     
         Add customer to notification system                         
         Remove customer from notification system                  
         Notify customer if available
       Collaborators: None		 

       Class Name notification system             
       Responsibilities:                
	 	 Get customer ready for table	
	 	 Check if available table		
	     Set customer ready for table  
	     Show customer ready for table
	   Collaborators: Restaurant, WaitStatus, Customer Arrangement, Customer, Table
	 
       Class Name Customer Arrangement               
       Responsibilities:
         Register customer into system
		 Add customer to waitlist
		 Remove customer from waitlist
         Send text to customer		   
	   Collaborators: None
	   
	   Class Name Table               
       Responsibilities:
         Check for available tables
		 Check number of seats for selected table
		 Assign table to customer party
         Set table as open or filled		 
	   Collaborators: None

       Class Name Customer           
       Responsibilities:              
         Stop sending messages        
         Confirm reservation          
         Leave waitlist                
       Collaborators: None

       Class Name WaitStatus           
       Responsibilities               
         Show State of Customer        
       Collaborators: notification system, Customer

       Class Name Waiting              
       Responsibilities               
         Stop sending messages
       Collaborators: WaitStatus		 

       Class Name Available            
       Responsibilities                
         Confirm reservation           
         Leave waitlist
       Collaborators: WaitStatus

       Class Name Gone            
       Responsibilities                         
         Leave waitlist
       Collaborators: WaitStatus		 	   
 
 2. Explanation:
	The design pattern used are Observer and State. 
	Observer is used because we need a way for a customer to be notified when there's a change in the waitlist.
    While Observer is used for broadcasting, there may be cases of long period of waiting with no response from the customer.
    State is used because the behavior of the customer object depends on its state.
    There are many options that the customer can choose that affect its state.

    Observer:
	-Subject (Interface): Restaurant
	-Observer (Interface): Customer
	-ConcreteSubject: notification system
	-ConcreteObserver: WaitStatus
	
	State:
	-Context (Interface): notification system
	-State (Interface): Customer
	-ConcreteState subclasses: Waiting, Available